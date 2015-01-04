package com.torrentlinks.vgurevich.torrentlinks;

import com.torrentlinks.vgurevich.torrentlinks.providers.TorrentLink;

import java.util.List;

/**
 * Created by vgurevich on 12/26/14.
 */
public interface ResultClient {
    void setResults(List<TorrentLink> links);
}
