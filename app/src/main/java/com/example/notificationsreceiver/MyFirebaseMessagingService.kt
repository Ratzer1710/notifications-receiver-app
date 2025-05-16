package com.example.notificationsreceiver

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        val title = message.notification?.title ?: "No title"
        val body = message.notification?.body ?: "No body"

        NotificationHelper.showNotification(this, title, body)
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
    }
}