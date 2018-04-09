package in.taxi.smarttaxi.listeners;

import in.taxi.smarttaxi.model.BasicBean;

public interface BasicListener {

    void onLoadCompleted(BasicBean basicBean);

    void onLoadFailed(String error);

}
