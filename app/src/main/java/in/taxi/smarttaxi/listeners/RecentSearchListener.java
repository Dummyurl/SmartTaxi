package in.taxi.smarttaxi.listeners;

import in.taxi.smarttaxi.model.RecentSearchBean;

public interface RecentSearchListener {

    void onLoadCompleted(RecentSearchBean recentSearchBean);

    void onLoadFailed(String webErrorMsg);
}
