package com.kabos.topicker.feature.collection.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kabos.domain.navigation.TopickerNavigationDestination
import com.kabos.topicker.feature.collection.CollectionRoute

object CollectionDestination: TopickerNavigationDestination {
    override val route = "collection_route"
    override val destination = "collection_destination"
}

fun NavGraphBuilder.collectionGraph() {
    composable(route = CollectionDestination.route) {
        CollectionRoute()
    }
}
