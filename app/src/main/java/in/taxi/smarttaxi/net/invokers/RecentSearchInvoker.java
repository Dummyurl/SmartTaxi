package in.taxi.smarttaxi.net.invokers;


import org.json.JSONObject;

import java.util.HashMap;

import in.taxi.smarttaxi.model.RecentSearchBean;
import in.taxi.smarttaxi.net.ServiceNames;
import in.taxi.smarttaxi.net.WebConnector;
import in.taxi.smarttaxi.net.parsers.RecentSearchParser;
import in.taxi.smarttaxi.net.utils.WSConstants;

public class RecentSearchInvoker extends BaseInvoker {

    private RecentSearchBean recentSearchBean;

    public RecentSearchInvoker(HashMap<String, String> urlParams,
                               JSONObject postData) {
        super(urlParams, postData);
    }

    public RecentSearchBean invokeRecentSearchWS() {

        WebConnector webConnector;

        webConnector = new WebConnector(new StringBuilder(ServiceNames.RECENT_SEARCHES), WSConstants.PROTOCOL_HTTP, urlParams, null);

        String wsResponseString = webConnector.connectToGET_service(true);
        System.out.println(">>>>>>>>>>> response: " + wsResponseString);
        RecentSearchBean recentSearchBean = null;

        if (wsResponseString.equals("")) {

            return recentSearchBean = null;

        } else {
            recentSearchBean = new RecentSearchBean();
            RecentSearchParser recentSearchParser = new RecentSearchParser();
            recentSearchBean = recentSearchParser.parseRecentSearchResponse(wsResponseString);
            return recentSearchBean;
        }
    }
}
