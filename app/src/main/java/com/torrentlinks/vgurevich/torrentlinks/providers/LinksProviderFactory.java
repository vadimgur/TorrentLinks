package com.torrentlinks.vgurevich.torrentlinks.providers;

/**
 * Created by vgurevich on 12/26/14.
 */
public class LinksProviderFactory {
    public static LinksProvider createProvider() {
        return new RarBGLinksProvider();
    }
}
