package computo.uach.mx;

import android.util.Log;


import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


import java.util.ArrayList;
import java.util.List;

public class MyFirebaseMessagingService extends FirebaseMessagingService{
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            List<Object> l = new ArrayList<>();
            l.add(remoteMessage.getData());
            String title = remoteMessage.getData().get("title");
            String body = remoteMessage.getData().get("body");
            MyNotificationManager.getInstance(getApplicationContext()).displayNotification(title,body);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
