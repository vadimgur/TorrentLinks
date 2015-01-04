package com.torrentlinks.vgurevich.torrentlinks;

import android.os.AsyncTask;

import com.torrentlinks.vgurevich.torrentlinks.providers.LinksProvider;
import com.torrentlinks.vgurevich.torrentlinks.providers.TorrentLink;

import java.util.List;

/**
 * Created by vgurevich on 12/26/14.
 */
public class GetLinksTask extends AsyncTask<LinksProvider, Integer, Long> {
    private int page;
    private String category;
    private ResultClient resultClient;
    private List<TorrentLink> links;

    public GetLinksTask(int page, String category, ResultClient resultClient) {
        this.page = page;
        this.category = category;
        this.resultClient = resultClient;
    }

    @Override
    protected Long doInBackground(LinksProvider... params) {
        LinksProvider provider = params[0];
        this.links = provider.getLinks(this.page, this.category);
        return (long) links.size();
    }

    @Override
    protected void onPostExecute(Long aLong) {
        super.onPostExecute(aLong);
        this.resultClient.setResults(this.links);
    }
}
