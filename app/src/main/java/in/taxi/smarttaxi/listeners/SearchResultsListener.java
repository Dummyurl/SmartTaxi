package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.SearchResultsBean;

public interface SearchResultsListener {

    void onLoadCompleted(SearchResultsBean searchResultsBean);

    void onLoadFailed(String webErrorMsg);
}
