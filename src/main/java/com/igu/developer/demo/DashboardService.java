package com.igu.developer.demo;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DashboardService implements GQLService {

    @GraphQLQuery(name = "dashboardInfoForAccount")
    public DashboardInfo getDashboardInfoForAccount(@GraphQLArgument(name = "accountId") @GraphQLNonNull UUID accountId) {
        return new DashboardInfo();
    }
}
