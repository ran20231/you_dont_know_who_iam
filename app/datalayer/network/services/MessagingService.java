package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.network.requestsbodies.InAppAnalyticsBody;
import com.forsale.app.datalayer.network.requestsbodies.InAppMessagesBody;
import com.forsale.app.datalayer.network.requestsbodies.InAppMessagesStatisticsBody;
import com.forsale.app.datalayer.network.requestsbodies.NewsFeedsMessagesBody;
import com.forsale.app.datalayer.network.requestsbodies.NotificationMessagesBody;
import com.forsale.app.datalayer.network.responses.InAppMessagesStatisticsResponse;
import com.forsale.app.datalayer.network.responses.ListingAnalyticsResponse;
import com.forsale.app.datalayer.network.responses.NewsFeedMessagesResponse;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import i10.a;
import i10.o;
import java.util.List;
/* compiled from: MessagingService.kt */
/* loaded from: classes2.dex */
public interface MessagingService {
    @o("Messaging/getActivityFeedMessages")
    Object getActivityFeedsMessagesAsync(@a NewsFeedsMessagesBody newsFeedsMessagesBody, zz.a<? super NewsFeedMessagesResponse> aVar);

    @o("Messaging/getInAppMessages")
    Object getInAppMessages(@a InAppMessagesBody inAppMessagesBody, zz.a<? super List<InAppMessageEntity>> aVar);

    @o("Messaging/getInAppSpecificAnalytics")
    Object getInAppSpecificAnalytics(@a InAppAnalyticsBody inAppAnalyticsBody, zz.a<? super ListingAnalyticsResponse> aVar);

    @o("Messaging/getMessages")
    Object getNotificationMessagesAsync(@a NotificationMessagesBody notificationMessagesBody, zz.a<? super NotificationMessagesResponse> aVar);

    @o("Messaging/incrementInAppMessageImpression")
    Object incrementInAppMessageImpression(@a InAppMessagesStatisticsBody inAppMessagesStatisticsBody, zz.a<? super InAppMessagesStatisticsResponse> aVar);

    @o("Messaging/incrementInAppMessageView")
    Object incrementInAppMessageView(@a InAppMessagesStatisticsBody inAppMessagesStatisticsBody, zz.a<? super InAppMessagesStatisticsResponse> aVar);
}
