package com.example.recommendationEngine.service;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ElasticSearchConnection {

    RestHighLevelClient client;

    public ElasticSearchConnection() {
        client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")));
    }


    public List<Map<String, Object>> search(String query, String index) {

        String[] indices = {index};
        SearchRequest searchRequest = new SearchRequest(indices);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.simpleQueryStringQuery(query));
        searchRequest.source(searchSourceBuilder);
        List<Map<String, Object>> list = new ArrayList<>();

        try {
            SearchResponse searchResponse = null;
            searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
            if (searchResponse.getHits().getTotalHits().value > 0) {
                SearchHit[] searchHit = searchResponse.getHits().getHits();
                for (SearchHit hit : searchHit) {
                    list.add(hit.getSourceAsMap());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
