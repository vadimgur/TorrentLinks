package com.torrentlinks.vgurevich.torrentlinks.providers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vgurevich on 12/26/14.
 */
public class RarBGLinksProvider implements LinksProvider {

    public static final String TABLE_ROW_SIGN = "<tr class=\"lista2\">";

    @Override
    public List<String> getCategories() {
        List<String> categories = new ArrayList<String>();
        categories.add("41");
        categories.add("45");
        return categories;
    }

    @Override
    public List<TorrentLink> getLinks(int page, String category) {
        List<TorrentLink> links = new ArrayList<TorrentLink>();
        BufferedReader in = null;
        try {
            String encode = /* URLEncoder.encode(*/"category[]=" + category;//, "UTF-8");
            URL url = new URL("http://www.rarbg.com/torrents.php?" + encode + "&page=" + page);
            URLConnection yc = url.openConnection();
            in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                int indTable = inputLine.indexOf(TABLE_ROW_SIGN);
                if (indTable != -1) {
                    String[] rows = inputLine.split(TABLE_ROW_SIGN);

                    for (String row : rows) {
                        int ind = row.indexOf("href=\"/torrent/");
                        if (ind != -1) {
                            int ind1 = ind + 15;
                            String id = row.substring(ind1, row.indexOf("\"", ind1));
                            int textInd = row.indexOf("title=\"", ind1) + 7;
                            String text = row.substring(textInd, row.indexOf("\"", textInd));
                            TorrentLink link = new TorrentLink(id, text);
                            links.add(link);
                        }
                    }
                    break;
                }
            }
        } catch (IOException e) {
            //
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    //
                }
            }
        }
        return links;
    }

    @Override
    public String getFullURL(TorrentLink link) {
        return null;
    }

    @Override
    public String getIMDBId(TorrentLink link) {
        return null;
    }
}
