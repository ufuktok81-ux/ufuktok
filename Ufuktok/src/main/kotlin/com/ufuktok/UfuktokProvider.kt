package com.ufuktok

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

/** Empty scaffold; add authorized content logic here. */
class UfuktokProvider : MainAPI() {
    // TODO: Set the base URL for a source you own or are authorized to use.
    override var mainUrl = ""
    override var name = "!ufuktok"
    override var lang = "tr"
    override val hasMainPage = false
    override val supportedTypes = emptySet<TvType>()

    override suspend fun search(query: String): List<SearchResponse> = emptyList()
}
