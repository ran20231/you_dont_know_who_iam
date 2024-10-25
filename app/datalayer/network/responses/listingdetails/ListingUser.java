package com.forsale.app.datalayer.network.responses.listingdetails;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingUser.kt */
/* loaded from: classes2.dex */
public final class ListingUser {
    @c("allow_follow")
    private final int allowFollow;
    private final int followers;
    private final int following;

    /* renamed from: id  reason: collision with root package name */
    private final long f22371id;
    private final String image;
    @c(FollowResponse.User.IS_FOLLOWING)
    private int isFollowing;
    @c("member_since")
    private final String memberSince;
    private final String name;
    @c("out_of_date_message")
    private final String outOfDateMessage;
    private final String phone;
    @c("region_id")
    private final int regionId;
    private final ListingUserStatus status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ListingUser.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingUser fromDetailsUser(BuyerListingDetailsResponseModel.Data.Listing.User user) {
            long j11;
            String str;
            int i11;
            String str2;
            String str3;
            String str4;
            int i12;
            Integer regionId;
            String memberSince;
            String firstName;
            Boolean isFollower;
            String image;
            Boolean allowFollow;
            String phone;
            Integer userId;
            if (user != null && (userId = user.getUserId()) != null) {
                j11 = userId.intValue();
            } else {
                j11 = -1;
            }
            long j12 = j11;
            if (user == null || (phone = user.getPhone()) == null) {
                str = "";
            } else {
                str = phone;
            }
            int i13 = 0;
            if (user != null && (allowFollow = user.getAllowFollow()) != null) {
                i11 = TypeExtensionsKt.H0(allowFollow.booleanValue());
            } else {
                i11 = 0;
            }
            if (user == null || (image = user.getImage()) == null) {
                str2 = "";
            } else {
                str2 = image;
            }
            if (user != null && (isFollower = user.isFollower()) != null) {
                i13 = TypeExtensionsKt.H0(isFollower.booleanValue());
            }
            int i14 = i13;
            if (user == null || (firstName = user.getFirstName()) == null) {
                str3 = "";
            } else {
                str3 = firstName;
            }
            if (user == null || (memberSince = user.getMemberSince()) == null) {
                str4 = "";
            } else {
                str4 = memberSince;
            }
            if (user != null && (regionId = user.getRegionId()) != null) {
                i12 = regionId.intValue();
            } else {
                i12 = 1;
            }
            return new ListingUser(i11, 0, 0, j12, str2, i14, str3, "", str, i12, ListingUserStatus.ACTIVE, str4);
        }
    }

    public ListingUser(int i11, int i12, int i13, long j11, String image, int i14, String name, String outOfDateMessage, String phone, int i15, ListingUserStatus status, String str) {
        o.i(image, "image");
        o.i(name, "name");
        o.i(outOfDateMessage, "outOfDateMessage");
        o.i(phone, "phone");
        o.i(status, "status");
        this.allowFollow = i11;
        this.followers = i12;
        this.following = i13;
        this.f22371id = j11;
        this.image = image;
        this.isFollowing = i14;
        this.name = name;
        this.outOfDateMessage = outOfDateMessage;
        this.phone = phone;
        this.regionId = i15;
        this.status = status;
        this.memberSince = str;
    }

    public static /* synthetic */ ListingUser copy$default(ListingUser listingUser, int i11, int i12, int i13, long j11, String str, int i14, String str2, String str3, String str4, int i15, ListingUserStatus listingUserStatus, String str5, int i16, Object obj) {
        int i17;
        int i18;
        int i19;
        long j12;
        String str6;
        int i21;
        String str7;
        String str8;
        String str9;
        int i22;
        ListingUserStatus listingUserStatus2;
        String str10;
        if ((i16 & 1) != 0) {
            i17 = listingUser.allowFollow;
        } else {
            i17 = i11;
        }
        if ((i16 & 2) != 0) {
            i18 = listingUser.followers;
        } else {
            i18 = i12;
        }
        if ((i16 & 4) != 0) {
            i19 = listingUser.following;
        } else {
            i19 = i13;
        }
        if ((i16 & 8) != 0) {
            j12 = listingUser.f22371id;
        } else {
            j12 = j11;
        }
        if ((i16 & 16) != 0) {
            str6 = listingUser.image;
        } else {
            str6 = str;
        }
        if ((i16 & 32) != 0) {
            i21 = listingUser.isFollowing;
        } else {
            i21 = i14;
        }
        if ((i16 & 64) != 0) {
            str7 = listingUser.name;
        } else {
            str7 = str2;
        }
        if ((i16 & 128) != 0) {
            str8 = listingUser.outOfDateMessage;
        } else {
            str8 = str3;
        }
        if ((i16 & 256) != 0) {
            str9 = listingUser.phone;
        } else {
            str9 = str4;
        }
        if ((i16 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i22 = listingUser.regionId;
        } else {
            i22 = i15;
        }
        if ((i16 & 1024) != 0) {
            listingUserStatus2 = listingUser.status;
        } else {
            listingUserStatus2 = listingUserStatus;
        }
        if ((i16 & RecyclerView.l.FLAG_MOVED) != 0) {
            str10 = listingUser.memberSince;
        } else {
            str10 = str5;
        }
        return listingUser.copy(i17, i18, i19, j12, str6, i21, str7, str8, str9, i22, listingUserStatus2, str10);
    }

    public final int component1() {
        return this.allowFollow;
    }

    public final int component10() {
        return this.regionId;
    }

    public final ListingUserStatus component11() {
        return this.status;
    }

    public final String component12() {
        return this.memberSince;
    }

    public final int component2() {
        return this.followers;
    }

    public final int component3() {
        return this.following;
    }

    public final long component4() {
        return this.f22371id;
    }

    public final String component5() {
        return this.image;
    }

    public final int component6() {
        return this.isFollowing;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.outOfDateMessage;
    }

    public final String component9() {
        return this.phone;
    }

    public final ListingUser copy(int i11, int i12, int i13, long j11, String image, int i14, String name, String outOfDateMessage, String phone, int i15, ListingUserStatus status, String str) {
        o.i(image, "image");
        o.i(name, "name");
        o.i(outOfDateMessage, "outOfDateMessage");
        o.i(phone, "phone");
        o.i(status, "status");
        return new ListingUser(i11, i12, i13, j11, image, i14, name, outOfDateMessage, phone, i15, status, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingUser)) {
            return false;
        }
        ListingUser listingUser = (ListingUser) obj;
        if (this.allowFollow == listingUser.allowFollow && this.followers == listingUser.followers && this.following == listingUser.following && this.f22371id == listingUser.f22371id && o.d(this.image, listingUser.image) && this.isFollowing == listingUser.isFollowing && o.d(this.name, listingUser.name) && o.d(this.outOfDateMessage, listingUser.outOfDateMessage) && o.d(this.phone, listingUser.phone) && this.regionId == listingUser.regionId && this.status == listingUser.status && o.d(this.memberSince, listingUser.memberSince)) {
            return true;
        }
        return false;
    }

    public final int getAllowFollow() {
        return this.allowFollow;
    }

    public final int getFollowers() {
        return this.followers;
    }

    public final int getFollowing() {
        return this.following;
    }

    public final long getId() {
        return this.f22371id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getMemberSince() {
        return this.memberSince;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOutOfDateMessage() {
        return this.outOfDateMessage;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final ListingUserStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((((Integer.hashCode(this.allowFollow) * 31) + Integer.hashCode(this.followers)) * 31) + Integer.hashCode(this.following)) * 31) + Long.hashCode(this.f22371id)) * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.isFollowing)) * 31) + this.name.hashCode()) * 31) + this.outOfDateMessage.hashCode()) * 31) + this.phone.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31) + this.status.hashCode()) * 31;
        String str = this.memberSince;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final int isFollowing() {
        return this.isFollowing;
    }

    public final void setFollowing(int i11) {
        this.isFollowing = i11;
    }

    public String toString() {
        int i11 = this.allowFollow;
        int i12 = this.followers;
        int i13 = this.following;
        long j11 = this.f22371id;
        String str = this.image;
        int i14 = this.isFollowing;
        String str2 = this.name;
        String str3 = this.outOfDateMessage;
        String str4 = this.phone;
        int i15 = this.regionId;
        ListingUserStatus listingUserStatus = this.status;
        String str5 = this.memberSince;
        return "ListingUser(allowFollow=" + i11 + ", followers=" + i12 + ", following=" + i13 + ", id=" + j11 + ", image=" + str + ", isFollowing=" + i14 + ", name=" + str2 + ", outOfDateMessage=" + str3 + ", phone=" + str4 + ", regionId=" + i15 + ", status=" + listingUserStatus + ", memberSince=" + str5 + ")";
    }
}
