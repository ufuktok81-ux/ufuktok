package com.ufuktok

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class UfuktokPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(UfuktokProvider())
    }
}
