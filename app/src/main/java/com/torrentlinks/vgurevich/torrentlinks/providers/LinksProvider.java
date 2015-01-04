package com.torrentlinks.vgurevich.torrentlinks.providers;

import java.util.List;

/**
 * Created by vgurevich on 12/26/14.
 */
public interface LinksProvider {

    List<String> getCategories();

    List<TorrentLink> getLinks(int page, String category);

    String getFullURL(TorrentLink link);

    String getIMDBId(TorrentLink link);
}
