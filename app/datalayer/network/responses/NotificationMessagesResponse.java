package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.utils.NotificationTypes;
import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: NotificationMessagesResponse.kt */
/* loaded from: classes2.dex */
public final class NotificationMessagesResponse {
    public static final int $stable = 8;
    @c(Constants.Keys.MESSAGES)
    private final List<NotificationMessage> messages;
    @c(AdvancedSearchBody.PAGE)
    private final int page;
    @c("total_messages")
    private final int totalMessages;
    @c("total_pages")
    private final int totalPages;

    /* compiled from: NotificationMessagesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class NotificationMessage {
        public static final int $stable = 0;
        @c(ForeSaleFCMMessage.ALERT)
        private final String alert;
        @c(ListingItemBase.DATE_PUBLISHED)
        private final String datePublished;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final Long f22360id;
        @c("type")
        private final NotificationTypes type;
        @c("url")
        private final String url;

        public NotificationMessage(String str, String str2, Long l11, NotificationTypes notificationTypes, String url) {
            o.i(url, "url");
            this.alert = str;
            this.datePublished = str2;
            this.f22360id = l11;
            this.type = notificationTypes;
            this.url = url;
        }

        public static /* synthetic */ NotificationMessage copy$default(NotificationMessage notificationMessage, String str, String str2, Long l11, NotificationTypes notificationTypes, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notificationMessage.alert;
            }
            if ((i11 & 2) != 0) {
                str2 = notificationMessage.datePublished;
            }
            String str4 = str2;
            if ((i11 & 4) != 0) {
                l11 = notificationMessage.f22360id;
            }
            Long l12 = l11;
            if ((i11 & 8) != 0) {
                notificationTypes = notificationMessage.type;
            }
            NotificationTypes notificationTypes2 = notificationTypes;
            if ((i11 & 16) != 0) {
                str3 = notificationMessage.url;
            }
            return notificationMessage.copy(str, str4, l12, notificationTypes2, str3);
        }

        public final String component1() {
            return this.alert;
        }

        public final String component2() {
            return this.datePublished;
        }

        public final Long component3() {
            return this.f22360id;
        }

        public final NotificationTypes component4() {
            return this.type;
        }

        public final String component5() {
            return this.url;
        }

        public final NotificationMessage copy(String str, String str2, Long l11, NotificationTypes notificationTypes, String url) {
            o.i(url, "url");
            return new NotificationMessage(str, str2, l11, notificationTypes, url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationMessage)) {
                return false;
            }
            NotificationMessage notificationMessage = (NotificationMessage) obj;
            if (o.d(this.alert, notificationMessage.alert) && o.d(this.datePublished, notificationMessage.datePublished) && o.d(this.f22360id, notificationMessage.f22360id) && this.type == notificationMessage.type && o.d(this.url, notificationMessage.url)) {
                return true;
            }
            return false;
        }

        public final String getAlert() {
            return this.alert;
        }

        public final String getDatePublished() {
            return this.datePublished;
        }

        public final Long getId() {
            return this.f22360id;
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
            String str = this.alert;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.datePublished;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            Long l11 = this.f22360id;
            if (l11 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l11.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            NotificationTypes notificationTypes = this.type;
            if (notificationTypes != null) {
                i11 = notificationTypes.hashCode();
            }
            return ((i14 + i11) * 31) + this.url.hashCode();
        }

        public final ForeSaleFCMMessage mapToForeSaleInAppMessage() {
            String str = this.alert;
            String valueOf = String.valueOf(this.f22360id);
            NotificationTypes notificationTypes = this.type;
            String str2 = this.url;
            return new ForeSaleFCMMessage(null, str, valueOf, notificationTypes, null, str2, str2);
        }

        public String toString() {
            String str = this.alert;
            String str2 = this.datePublished;
            Long l11 = this.f22360id;
            NotificationTypes notificationTypes = this.type;
            String str3 = this.url;
            return "NotificationMessage(alert=" + str + ", datePublished=" + str2 + ", id=" + l11 + ", type=" + notificationTypes + ", url=" + str3 + ")";
        }
    }

    public NotificationMessagesResponse(List<NotificationMessage> messages, int i11, int i12, int i13) {
        o.i(messages, "messages");
        this.messages = messages;
        this.page = i11;
        this.totalMessages = i12;
        this.totalPages = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationMessagesResponse copy$default(NotificationMessagesResponse notificationMessagesResponse, List list, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = notificationMessagesResponse.messages;
        }
        if ((i14 & 2) != 0) {
            i11 = notificationMessagesResponse.page;
        }
        if ((i14 & 4) != 0) {
            i12 = notificationMessagesResponse.totalMessages;
        }
        if ((i14 & 8) != 0) {
            i13 = notificationMessagesResponse.totalPages;
        }
        return notificationMessagesResponse.copy(list, i11, i12, i13);
    }

    public final List<NotificationMessage> component1() {
        return this.messages;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.totalMessages;
    }

    public final int component4() {
        return this.totalPages;
    }

    public final NotificationMessagesResponse copy(List<NotificationMessage> messages, int i11, int i12, int i13) {
        o.i(messages, "messages");
        return new NotificationMessagesResponse(messages, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationMessagesResponse)) {
            return false;
        }
        NotificationMessagesResponse notificationMessagesResponse = (NotificationMessagesResponse) obj;
        if (o.d(this.messages, notificationMessagesResponse.messages) && this.page == notificationMessagesResponse.page && this.totalMessages == notificationMessagesResponse.totalMessages && this.totalPages == notificationMessagesResponse.totalPages) {
            return true;
        }
        return false;
    }

    public final List<NotificationMessage> getMessages() {
        return this.messages;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getTotalMessages() {
        return this.totalMessages;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return (((((this.messages.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.totalMessages)) * 31) + Integer.hashCode(this.totalPages);
    }

    public String toString() {
        List<NotificationMessage> list = this.messages;
        int i11 = this.page;
        int i12 = this.totalMessages;
        int i13 = this.totalPages;
        return "NotificationMessagesResponse(messages=" + list + ", page=" + i11 + ", totalMessages=" + i12 + ", totalPages=" + i13 + ")";
    }
}
