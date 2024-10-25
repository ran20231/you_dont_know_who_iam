package com.forsale.app.datalayer.network.responses;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import falcon.chat.entities.MessageKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: AboutToExpireListing.kt */
/* loaded from: classes2.dex */
public final class AboutToExpireListing {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @c("cat_ar_name")
    private final String catArName;
    @c("cat_en_name")
    private final String catEnName;
    @c("cat_id")
    private final int catId;
    @c("contact")
    private final String contact;
    @c(ListingItemBase.DATE_PUBLISHED)
    private final String datePublished;
    @c("expire_date")
    private final String expireDate;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22344id;
    @c("image")
    private final String image;
    @c(ListingItemBase.IS_VOIP)
    private final Integer isVoip;
    @c("phone")
    private final String phone;
    @c("price")
    private final int price;
    @c(ListingItemBase.REG_ID)
    private final int regId;
    @c("remaining_seconds")
    private final int remainingSeconds;
    @c(MessageKt.STATUS)
    private final ItemStatus status;
    @c("thumb")
    private final String thumb;
    @c("title")
    private final String title;

    /* compiled from: AboutToExpireListing.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AboutToExpireListing from$default(Companion companion, ListingItemBrief listingItemBrief, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 100000000;
            }
            return companion.from(listingItemBrief, i11);
        }

        public static /* synthetic */ AboutToExpireListing mockListingItem$default(Companion companion, int i11, int i12, String str, String str2, int i13, int i14, int i15, Object obj) {
            if ((i15 & 32) != 0) {
                i14 = 100000000;
            }
            return companion.mockListingItem(i11, i12, str, str2, i13, i14);
        }

        public final AboutToExpireListing from(ListingItemBrief item, int i11) {
            String str;
            o.i(item, "item");
            int catId = item.getCatId();
            String contact = item.getContact();
            String datePublished = item.getDatePublished();
            if (datePublished == null) {
                datePublished = "";
            }
            int id2 = item.getId();
            String image = item.getImage();
            Integer valueOf = Integer.valueOf(item.isVoip());
            String phone = item.getPhone();
            int price = (int) item.getPrice();
            int regId = item.getRegId();
            ItemStatus itemStatus = ItemStatus.NORMAL;
            String thumb = item.getThumb();
            String title = item.getTitle();
            if (title == null) {
                str = "";
            } else {
                str = title;
            }
            return new AboutToExpireListing("Cars", "Cars", catId, contact, datePublished, "", id2, image, valueOf, phone, price, regId, i11, itemStatus, thumb, str);
        }

        public final AboutToExpireListing mockListingItem(int i11, int i12, String title, String image, int i13, int i14) {
            o.i(title, "title");
            o.i(image, "image");
            return new AboutToExpireListing("Cars", "Cars", i12, "", "", "", i11, image, 0, "", i13, 1, i14, ItemStatus.NORMAL, "", title);
        }
    }

    public AboutToExpireListing(String catArName, String catEnName, int i11, String str, String datePublished, String expireDate, int i12, String str2, Integer num, String str3, int i13, int i14, int i15, ItemStatus status, String str4, String title) {
        o.i(catArName, "catArName");
        o.i(catEnName, "catEnName");
        o.i(datePublished, "datePublished");
        o.i(expireDate, "expireDate");
        o.i(status, "status");
        o.i(title, "title");
        this.catArName = catArName;
        this.catEnName = catEnName;
        this.catId = i11;
        this.contact = str;
        this.datePublished = datePublished;
        this.expireDate = expireDate;
        this.f22344id = i12;
        this.image = str2;
        this.isVoip = num;
        this.phone = str3;
        this.price = i13;
        this.regId = i14;
        this.remainingSeconds = i15;
        this.status = status;
        this.thumb = str4;
        this.title = title;
    }

    public final String component1() {
        return this.catArName;
    }

    public final String component10() {
        return this.phone;
    }

    public final int component11() {
        return this.price;
    }

    public final int component12() {
        return this.regId;
    }

    public final int component13() {
        return this.remainingSeconds;
    }

    public final ItemStatus component14() {
        return this.status;
    }

    public final String component15() {
        return this.thumb;
    }

    public final String component16() {
        return this.title;
    }

    public final String component2() {
        return this.catEnName;
    }

    public final int component3() {
        return this.catId;
    }

    public final String component4() {
        return this.contact;
    }

    public final String component5() {
        return this.datePublished;
    }

    public final String component6() {
        return this.expireDate;
    }

    public final int component7() {
        return this.f22344id;
    }

    public final String component8() {
        return this.image;
    }

    public final Integer component9() {
        return this.isVoip;
    }

    public final AboutToExpireListing copy(String catArName, String catEnName, int i11, String str, String datePublished, String expireDate, int i12, String str2, Integer num, String str3, int i13, int i14, int i15, ItemStatus status, String str4, String title) {
        o.i(catArName, "catArName");
        o.i(catEnName, "catEnName");
        o.i(datePublished, "datePublished");
        o.i(expireDate, "expireDate");
        o.i(status, "status");
        o.i(title, "title");
        return new AboutToExpireListing(catArName, catEnName, i11, str, datePublished, expireDate, i12, str2, num, str3, i13, i14, i15, status, str4, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutToExpireListing)) {
            return false;
        }
        AboutToExpireListing aboutToExpireListing = (AboutToExpireListing) obj;
        if (o.d(this.catArName, aboutToExpireListing.catArName) && o.d(this.catEnName, aboutToExpireListing.catEnName) && this.catId == aboutToExpireListing.catId && o.d(this.contact, aboutToExpireListing.contact) && o.d(this.datePublished, aboutToExpireListing.datePublished) && o.d(this.expireDate, aboutToExpireListing.expireDate) && this.f22344id == aboutToExpireListing.f22344id && o.d(this.image, aboutToExpireListing.image) && o.d(this.isVoip, aboutToExpireListing.isVoip) && o.d(this.phone, aboutToExpireListing.phone) && this.price == aboutToExpireListing.price && this.regId == aboutToExpireListing.regId && this.remainingSeconds == aboutToExpireListing.remainingSeconds && this.status == aboutToExpireListing.status && o.d(this.thumb, aboutToExpireListing.thumb) && o.d(this.title, aboutToExpireListing.title)) {
            return true;
        }
        return false;
    }

    public final String getCatArName() {
        return this.catArName;
    }

    public final String getCatEnName() {
        return this.catEnName;
    }

    public final int getCatId() {
        return this.catId;
    }

    public final String getCategoryName() {
        CharSequence Z0;
        CharSequence Z02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            Z02 = StringsKt__StringsKt.Z0(this.catEnName);
            return Z02.toString();
        }
        Z0 = StringsKt__StringsKt.Z0(this.catArName);
        return Z0.toString();
    }

    public final String getContact() {
        return this.contact;
    }

    public final String getDatePublished() {
        return this.datePublished;
    }

    public final String getExpireDate() {
        return this.expireDate;
    }

    public final int getId() {
        return this.f22344id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getRegId() {
        return this.regId;
    }

    public final int getRemainingSeconds() {
        return this.remainingSeconds;
    }

    public final ItemStatus getStatus() {
        return this.status;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((this.catArName.hashCode() * 31) + this.catEnName.hashCode()) * 31) + Integer.hashCode(this.catId)) * 31;
        String str = this.contact;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((((((hashCode5 + hashCode) * 31) + this.datePublished.hashCode()) * 31) + this.expireDate.hashCode()) * 31) + Integer.hashCode(this.f22344id)) * 31;
        String str2 = this.image;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (hashCode6 + hashCode2) * 31;
        Integer num = this.isVoip;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str3 = this.phone;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode7 = (((((((((i13 + hashCode4) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.regId)) * 31) + Integer.hashCode(this.remainingSeconds)) * 31) + this.status.hashCode()) * 31;
        String str4 = this.thumb;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return ((hashCode7 + i11) * 31) + this.title.hashCode();
    }

    public final Integer isVoip() {
        return this.isVoip;
    }

    public String toString() {
        String str = this.catArName;
        String str2 = this.catEnName;
        int i11 = this.catId;
        String str3 = this.contact;
        String str4 = this.datePublished;
        String str5 = this.expireDate;
        int i12 = this.f22344id;
        String str6 = this.image;
        Integer num = this.isVoip;
        String str7 = this.phone;
        int i13 = this.price;
        int i14 = this.regId;
        int i15 = this.remainingSeconds;
        ItemStatus itemStatus = this.status;
        String str8 = this.thumb;
        String str9 = this.title;
        return "AboutToExpireListing(catArName=" + str + ", catEnName=" + str2 + ", catId=" + i11 + ", contact=" + str3 + ", datePublished=" + str4 + ", expireDate=" + str5 + ", id=" + i12 + ", image=" + str6 + ", isVoip=" + num + ", phone=" + str7 + ", price=" + i13 + ", regId=" + i14 + ", remainingSeconds=" + i15 + ", status=" + itemStatus + ", thumb=" + str8 + ", title=" + str9 + ")";
    }

    public /* synthetic */ AboutToExpireListing(String str, String str2, int i11, String str3, String str4, String str5, int i12, String str6, Integer num, String str7, int i13, int i14, int i15, ItemStatus itemStatus, String str8, String str9, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11, str3, str4, str5, i12, str6, num, str7, (i16 & 1024) != 0 ? 0 : i13, i14, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i15, itemStatus, str8, str9);
    }
}
