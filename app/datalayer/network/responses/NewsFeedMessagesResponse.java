package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.forsale.app.utils.NotificationTypes;
import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: NewsFeedMessagesResponse.kt */
/* loaded from: classes2.dex */
public final class NewsFeedMessagesResponse {
    public static final int $stable = 8;
    @c("last_timestamp")
    private final Long lastTimestamp;
    @c("results")
    private final List<FeedMessage> results;

    /* compiled from: NewsFeedMessagesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class FeedMessage {
        public static final int $stable = 0;
        @c("date")
        private final String date;
        @c(InAppMessageEntity.ITEM_ID)
        private final String itemId;
        @c(Constants.Params.MESSAGE)
        private final String message;
        @c("type")
        private final NotificationTypes type;
        @c("url")
        private final String url;

        public FeedMessage(String str, String str2, String str3, NotificationTypes notificationTypes, String str4) {
            this.date = str;
            this.itemId = str2;
            this.message = str3;
            this.type = notificationTypes;
            this.url = str4;
        }

        public static /* synthetic */ FeedMessage copy$default(FeedMessage feedMessage, String str, String str2, String str3, NotificationTypes notificationTypes, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = feedMessage.date;
            }
            if ((i11 & 2) != 0) {
                str2 = feedMessage.itemId;
            }
            String str5 = str2;
            if ((i11 & 4) != 0) {
                str3 = feedMessage.message;
            }
            String str6 = str3;
            if ((i11 & 8) != 0) {
                notificationTypes = feedMessage.type;
            }
            NotificationTypes notificationTypes2 = notificationTypes;
            if ((i11 & 16) != 0) {
                str4 = feedMessage.url;
            }
            return feedMessage.copy(str, str5, str6, notificationTypes2, str4);
        }

        public final String component1() {
            return this.date;
        }

        public final String component2() {
            return this.itemId;
        }

        public final String component3() {
            return this.message;
        }

        public final NotificationTypes component4() {
            return this.type;
        }

        public final String component5() {
            return this.url;
        }

        public final FeedMessage copy(String str, String str2, String str3, NotificationTypes notificationTypes, String str4) {
            return new FeedMessage(str, str2, str3, notificationTypes, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedMessage)) {
                return false;
            }
            FeedMessage feedMessage = (FeedMessage) obj;
            if (o.d(this.date, feedMessage.date) && o.d(this.itemId, feedMessage.itemId) && o.d(this.message, feedMessage.message) && this.type == feedMessage.type && o.d(this.url, feedMessage.url)) {
                return true;
            }
            return false;
        }

        public final String getDate() {
            return this.date;
        }

        public final String getItemId() {
            return this.itemId;
        }

        public final String getMessage() {
            return this.message;
        }

        public final NotificationTypes getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            String str = this.date;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.itemId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.message;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            NotificationTypes notificationTypes = this.type;
            if (notificationTypes == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = notificationTypes.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str4 = this.url;
            if (str4 != null) {
                i11 = str4.hashCode();
            }
            return i15 + i11;
        }

        public final ForeSaleFCMMessage mapToForeSaleInAppMessage() {
            String str = this.message;
            String str2 = this.itemId;
            NotificationTypes notificationTypes = this.type;
            String str3 = this.url;
            return new ForeSaleFCMMessage(null, str, str2, notificationTypes, null, str3, str3);
        }

        public String toString() {
            String str = this.date;
            String str2 = this.itemId;
            String str3 = this.message;
            NotificationTypes notificationTypes = this.type;
            String str4 = this.url;
            return "FeedMessage(date=" + str + ", itemId=" + str2 + ", message=" + str3 + ", type=" + notificationTypes + ", url=" + str4 + ")";
        }
    }

    public NewsFeedMessagesResponse(Long l11, List<FeedMessage> list) {
        this.lastTimestamp = l11;
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsFeedMessagesResponse copy$default(NewsFeedMessagesResponse newsFeedMessagesResponse, Long l11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = newsFeedMessagesResponse.lastTimestamp;
        }
        if ((i11 & 2) != 0) {
            list = newsFeedMessagesResponse.results;
        }
        return newsFeedMessagesResponse.copy(l11, list);
    }

    public final Long component1() {
        return this.lastTimestamp;
    }

    public final List<FeedMessage> component2() {
        return this.results;
    }

    public final NewsFeedMessagesResponse copy(Long l11, List<FeedMessage> list) {
        return new NewsFeedMessagesResponse(l11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsFeedMessagesResponse)) {
            return false;
        }
        NewsFeedMessagesResponse newsFeedMessagesResponse = (NewsFeedMessagesResponse) obj;
        if (o.d(this.lastTimestamp, newsFeedMessagesResponse.lastTimestamp) && o.d(this.results, newsFeedMessagesResponse.results)) {
            return true;
        }
        return false;
    }

    public final Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public final List<FeedMessage> getResults() {
        return this.results;
    }

    public int hashCode() {
        int hashCode;
        Long l11 = this.lastTimestamp;
        int i11 = 0;
        if (l11 == null) {
            hashCode = 0;
        } else {
            hashCode = l11.hashCode();
        }
        int i12 = hashCode * 31;
        List<FeedMessage> list = this.results;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Long l11 = this.lastTimestamp;
        List<FeedMessage> list = this.results;
        return "NewsFeedMessagesResponse(lastTimestamp=" + l11 + ", results=" + list + ")";
    }
}
