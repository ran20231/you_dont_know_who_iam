package com.forsale.app.datalayer.database;

import android.graphics.Bitmap;
import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.forsale.app.utils.NotificationTypes;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import up.c;
/* compiled from: InAppMessageEntity.kt */
/* loaded from: classes2.dex */
public final class InAppMessageEntity {
    public static final String ACTION = "action";
    public static final String CAT_ID = "cat_id";
    public static final String DISTRICT_IDS = "districts_ids";
    public static final String DURATION = "duration";
    public static final String EXPIRY = "expiry";
    public static final String ID = "id";
    public static final String IMAGE = "image";
    public static final String IN_APP_MESSAGE_TABLE = "in_app_message";
    public static final String ITEM_ID = "item_id";
    public static final String NOTIFICATION_TYPE = "notification_type";
    public static final String PROMOTE_ANIMATION = "promote_animation";
    public static final String REGION_ID = "region_id";
    public static final String TARGET_ID = "target_id";
    public static final String TEXT = "text";
    public static final String TYPE = "type";
    public static final String UNIVERSAL_LINK = "universal_link";
    public static final String URL = "url";
    private final InAppAction action;
    @c("cat_id")
    private final Integer catId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    private final int duration;
    private final String expiry;

    /* renamed from: id  reason: collision with root package name */
    private final int f22316id;
    private final String image;
    private Bitmap imageBitmap;
    @c(ITEM_ID)
    private final Integer itemId;
    @c(NOTIFICATION_TYPE)
    private final NotificationTypes notificationType;
    @c("promote_animation")
    private final String promoteAnimation;
    @c("region_id")
    private final Integer regionId;
    @c(TARGET_ID)
    private final Integer targetId;
    private final String text;
    private final InAppType type;
    @c("universal_link")
    private final String universalLink;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InAppMessageEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InAppMessageEntity makeMockInApp(Integer num, String str, String title, InAppType inAppType) {
            o.i(title, "title");
            o.i(inAppType, "inAppType");
            return new InAppMessageEntity(0, InAppAction.SAVE, num, 10, null, str, null, null, null, 1, null, title, inAppType, null, null, "https://www.q84sale.com/ar/category/1540", Http2.INITIAL_MAX_FRAME_SIZE, null);
        }
    }

    public InAppMessageEntity(int i11, InAppAction action, Integer num, int i12, String str, String str2, Integer num2, NotificationTypes notificationTypes, String str3, Integer num3, Integer num4, String str4, InAppType inAppType, String str5, List<Integer> list, String str6) {
        o.i(action, "action");
        this.f22316id = i11;
        this.action = action;
        this.catId = num;
        this.duration = i12;
        this.expiry = str;
        this.image = str2;
        this.itemId = num2;
        this.notificationType = notificationTypes;
        this.promoteAnimation = str3;
        this.regionId = num3;
        this.targetId = num4;
        this.text = str4;
        this.type = inAppType;
        this.url = str5;
        this.districtsIds = list;
        this.universalLink = str6;
    }

    public final int component1() {
        return this.f22316id;
    }

    public final Integer component10() {
        return this.regionId;
    }

    public final Integer component11() {
        return this.targetId;
    }

    public final String component12() {
        return this.text;
    }

    public final InAppType component13() {
        return this.type;
    }

    public final String component14() {
        return this.url;
    }

    public final List<Integer> component15() {
        return this.districtsIds;
    }

    public final String component16() {
        return this.universalLink;
    }

    public final InAppAction component2() {
        return this.action;
    }

    public final Integer component3() {
        return this.catId;
    }

    public final int component4() {
        return this.duration;
    }

    public final String component5() {
        return this.expiry;
    }

    public final String component6() {
        return this.image;
    }

    public final Integer component7() {
        return this.itemId;
    }

    public final NotificationTypes component8() {
        return this.notificationType;
    }

    public final String component9() {
        return this.promoteAnimation;
    }

    public final InAppMessageEntity copy(int i11, InAppAction action, Integer num, int i12, String str, String str2, Integer num2, NotificationTypes notificationTypes, String str3, Integer num3, Integer num4, String str4, InAppType inAppType, String str5, List<Integer> list, String str6) {
        o.i(action, "action");
        return new InAppMessageEntity(i11, action, num, i12, str, str2, num2, notificationTypes, str3, num3, num4, str4, inAppType, str5, list, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageEntity)) {
            return false;
        }
        InAppMessageEntity inAppMessageEntity = (InAppMessageEntity) obj;
        if (this.f22316id == inAppMessageEntity.f22316id && this.action == inAppMessageEntity.action && o.d(this.catId, inAppMessageEntity.catId) && this.duration == inAppMessageEntity.duration && o.d(this.expiry, inAppMessageEntity.expiry) && o.d(this.image, inAppMessageEntity.image) && o.d(this.itemId, inAppMessageEntity.itemId) && this.notificationType == inAppMessageEntity.notificationType && o.d(this.promoteAnimation, inAppMessageEntity.promoteAnimation) && o.d(this.regionId, inAppMessageEntity.regionId) && o.d(this.targetId, inAppMessageEntity.targetId) && o.d(this.text, inAppMessageEntity.text) && this.type == inAppMessageEntity.type && o.d(this.url, inAppMessageEntity.url) && o.d(this.districtsIds, inAppMessageEntity.districtsIds) && o.d(this.universalLink, inAppMessageEntity.universalLink)) {
            return true;
        }
        return false;
    }

    public final InAppAction getAction() {
        return this.action;
    }

    public final Integer getCatId() {
        return this.catId;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final int getId() {
        return this.f22316id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    public final Integer getItemId() {
        return this.itemId;
    }

    public final NotificationTypes getNotificationType() {
        return this.notificationType;
    }

    public final String getPromoteAnimation() {
        return this.promoteAnimation;
    }

    public final Integer getRegionId() {
        return this.regionId;
    }

    public final Integer getTargetId() {
        return this.targetId;
    }

    public final String getText() {
        return this.text;
    }

    public final InAppType getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13 = ((Integer.hashCode(this.f22316id) * 31) + this.action.hashCode()) * 31;
        Integer num = this.catId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode14 = (((hashCode13 + hashCode) * 31) + Integer.hashCode(this.duration)) * 31;
        String str = this.expiry;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (hashCode14 + hashCode2) * 31;
        String str2 = this.image;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num2 = this.itemId;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        NotificationTypes notificationTypes = this.notificationType;
        if (notificationTypes == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = notificationTypes.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str3 = this.promoteAnimation;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Integer num3 = this.regionId;
        if (num3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num3.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Integer num4 = this.targetId;
        if (num4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num4.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str4 = this.text;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        InAppType inAppType = this.type;
        if (inAppType == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = inAppType.hashCode();
        }
        int i21 = (i19 + hashCode10) * 31;
        String str5 = this.url;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i22 = (i21 + hashCode11) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list.hashCode();
        }
        int i23 = (i22 + hashCode12) * 31;
        String str6 = this.universalLink;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return i23 + i11;
    }

    public final ForeSaleFCMMessage mapToForeSaleInAppMessage() {
        boolean z11;
        String str = this.text;
        String valueOf = String.valueOf(this.targetId);
        NotificationTypes notificationTypes = this.notificationType;
        String str2 = this.url;
        ForeSaleFCMMessage foreSaleFCMMessage = new ForeSaleFCMMessage(null, str, valueOf, notificationTypes, null, str2, str2);
        if (this.type == InAppType.IN_APP) {
            z11 = true;
        } else {
            z11 = false;
        }
        foreSaleFCMMessage.setInAppMessage(Boolean.valueOf(z11));
        return foreSaleFCMMessage;
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.imageBitmap = bitmap;
    }

    public String toString() {
        int i11 = this.f22316id;
        InAppAction inAppAction = this.action;
        Integer num = this.catId;
        int i12 = this.duration;
        String str = this.expiry;
        String str2 = this.image;
        Integer num2 = this.itemId;
        NotificationTypes notificationTypes = this.notificationType;
        String str3 = this.promoteAnimation;
        Integer num3 = this.regionId;
        Integer num4 = this.targetId;
        String str4 = this.text;
        InAppType inAppType = this.type;
        String str5 = this.url;
        List<Integer> list = this.districtsIds;
        String str6 = this.universalLink;
        return "InAppMessageEntity(id=" + i11 + ", action=" + inAppAction + ", catId=" + num + ", duration=" + i12 + ", expiry=" + str + ", image=" + str2 + ", itemId=" + num2 + ", notificationType=" + notificationTypes + ", promoteAnimation=" + str3 + ", regionId=" + num3 + ", targetId=" + num4 + ", text=" + str4 + ", type=" + inAppType + ", url=" + str5 + ", districtsIds=" + list + ", universalLink=" + str6 + ")";
    }

    public /* synthetic */ InAppMessageEntity(int i11, InAppAction inAppAction, Integer num, int i12, String str, String str2, Integer num2, NotificationTypes notificationTypes, String str3, Integer num3, Integer num4, String str4, InAppType inAppType, String str5, List list, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, inAppAction, num, i12, str, str2, num2, notificationTypes, str3, num3, num4, str4, inAppType, str5, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list, str6);
    }
}
