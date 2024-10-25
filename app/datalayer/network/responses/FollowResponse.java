package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.google.android.gms.ads.AdRequest;
import falcon.chat.entities.MessageKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
import yd.a;
/* compiled from: FollowResponse.kt */
/* loaded from: classes2.dex */
public final class FollowResponse {
    public static final int $stable = 8;
    @c(AdvancedSearchBody.PAGE)
    private final int page;
    @c("total_listings")
    private final String totalListings;
    @c("total_pages")
    private final int totalPages;
    @c("users")
    private final List<User> users;

    /* compiled from: FollowResponse.kt */
    /* loaded from: classes2.dex */
    public static final class User {
        public static final String FOLLOW_USER_TABLE_NAME = "follow_user";
        public static final String IS_FOLLOWING = "is_following";
        public static final String PHONE = "phone";
        public static final String USER_LOCAL_ID = "user_local_id";
        public static final String USER_SERVER_ID = "user_server_id";
        @c("allow_follow")
        private final int allowFollow;
        @c("follower_id")
        private final String followerId;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final String f22349id;
        @c("image")
        private final String image;
        @c(IS_FOLLOWING)
        private final int isFollowing;
        @c("last_upload_date")
        private final String lastUploadDate;
        private final long localId;
        @c("name")
        private final String name;
        private transient int pageNumber;
        @c("phone")
        private final String phone;
        @c("region_id")
        private final String regionId;
        @c(MessageKt.STATUS)
        private final String status;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: FollowResponse.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public User(int i11, String str, String id2, long j11, String str2, int i12, String str3, String str4, String str5, String str6, String str7) {
            o.i(id2, "id");
            this.allowFollow = i11;
            this.followerId = str;
            this.f22349id = id2;
            this.localId = j11;
            this.image = str2;
            this.isFollowing = i12;
            this.lastUploadDate = str3;
            this.name = str4;
            this.phone = str5;
            this.regionId = str6;
            this.status = str7;
        }

        public static /* synthetic */ User copy$default(User user, int i11, String str, String str2, long j11, String str3, int i12, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
            int i14;
            String str9;
            String str10;
            long j12;
            String str11;
            int i15;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            if ((i13 & 1) != 0) {
                i14 = user.allowFollow;
            } else {
                i14 = i11;
            }
            if ((i13 & 2) != 0) {
                str9 = user.followerId;
            } else {
                str9 = str;
            }
            if ((i13 & 4) != 0) {
                str10 = user.f22349id;
            } else {
                str10 = str2;
            }
            if ((i13 & 8) != 0) {
                j12 = user.localId;
            } else {
                j12 = j11;
            }
            if ((i13 & 16) != 0) {
                str11 = user.image;
            } else {
                str11 = str3;
            }
            if ((i13 & 32) != 0) {
                i15 = user.isFollowing;
            } else {
                i15 = i12;
            }
            if ((i13 & 64) != 0) {
                str12 = user.lastUploadDate;
            } else {
                str12 = str4;
            }
            if ((i13 & 128) != 0) {
                str13 = user.name;
            } else {
                str13 = str5;
            }
            if ((i13 & 256) != 0) {
                str14 = user.phone;
            } else {
                str14 = str6;
            }
            if ((i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                str15 = user.regionId;
            } else {
                str15 = str7;
            }
            if ((i13 & 1024) != 0) {
                str16 = user.status;
            } else {
                str16 = str8;
            }
            return user.copy(i14, str9, str10, j12, str11, i15, str12, str13, str14, str15, str16);
        }

        public final int component1() {
            return this.allowFollow;
        }

        public final String component10() {
            return this.regionId;
        }

        public final String component11() {
            return this.status;
        }

        public final String component2() {
            return this.followerId;
        }

        public final String component3() {
            return this.f22349id;
        }

        public final long component4() {
            return this.localId;
        }

        public final String component5() {
            return this.image;
        }

        public final int component6() {
            return this.isFollowing;
        }

        public final String component7() {
            return this.lastUploadDate;
        }

        public final String component8() {
            return this.name;
        }

        public final String component9() {
            return this.phone;
        }

        public final User copy(int i11, String str, String id2, long j11, String str2, int i12, String str3, String str4, String str5, String str6, String str7) {
            o.i(id2, "id");
            return new User(i11, str, id2, j11, str2, i12, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            if (this.allowFollow == user.allowFollow && o.d(this.followerId, user.followerId) && o.d(this.f22349id, user.f22349id) && this.localId == user.localId && o.d(this.image, user.image) && this.isFollowing == user.isFollowing && o.d(this.lastUploadDate, user.lastUploadDate) && o.d(this.name, user.name) && o.d(this.phone, user.phone) && o.d(this.regionId, user.regionId) && o.d(this.status, user.status)) {
                return true;
            }
            return false;
        }

        public final int getAllowFollow() {
            return this.allowFollow;
        }

        public final String getFollowerId() {
            return this.followerId;
        }

        public final String getId() {
            return this.f22349id;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getLastUploadDate() {
            return this.lastUploadDate;
        }

        public final long getLocalId() {
            return this.localId;
        }

        public final String getName() {
            return this.name;
        }

        public final int getPageNumber() {
            return this.pageNumber;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getRegionId() {
            return this.regionId;
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7 = Integer.hashCode(this.allowFollow) * 31;
            String str = this.followerId;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode8 = (((((hashCode7 + hashCode) * 31) + this.f22349id.hashCode()) * 31) + Long.hashCode(this.localId)) * 31;
            String str2 = this.image;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode9 = (((hashCode8 + hashCode2) * 31) + Integer.hashCode(this.isFollowing)) * 31;
            String str3 = this.lastUploadDate;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (hashCode9 + hashCode3) * 31;
            String str4 = this.name;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            String str5 = this.phone;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i14 = (i13 + hashCode5) * 31;
            String str6 = this.regionId;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str7 = this.status;
            if (str7 != null) {
                i11 = str7.hashCode();
            }
            return i15 + i11;
        }

        public final int isFollowing() {
            return this.isFollowing;
        }

        public final void setPageNumber(int i11) {
            this.pageNumber = i11;
        }

        public String toString() {
            int i11 = this.allowFollow;
            String str = this.followerId;
            String str2 = this.f22349id;
            long j11 = this.localId;
            String str3 = this.image;
            int i12 = this.isFollowing;
            String str4 = this.lastUploadDate;
            String str5 = this.name;
            String str6 = this.phone;
            String str7 = this.regionId;
            String str8 = this.status;
            return "User(allowFollow=" + i11 + ", followerId=" + str + ", id=" + str2 + ", localId=" + j11 + ", image=" + str3 + ", isFollowing=" + i12 + ", lastUploadDate=" + str4 + ", name=" + str5 + ", phone=" + str6 + ", regionId=" + str7 + ", status=" + str8 + ")";
        }

        public final a toUserItemUiModel() {
            return new a(this.f22349id, String.valueOf(this.name), this.image, String.valueOf(this.phone), this.isFollowing, this.lastUploadDate, this.allowFollow);
        }
    }

    public FollowResponse(int i11, String totalListings, int i12, List<User> users) {
        o.i(totalListings, "totalListings");
        o.i(users, "users");
        this.page = i11;
        this.totalListings = totalListings;
        this.totalPages = i12;
        this.users = users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowResponse copy$default(FollowResponse followResponse, int i11, String str, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = followResponse.page;
        }
        if ((i13 & 2) != 0) {
            str = followResponse.totalListings;
        }
        if ((i13 & 4) != 0) {
            i12 = followResponse.totalPages;
        }
        if ((i13 & 8) != 0) {
            list = followResponse.users;
        }
        return followResponse.copy(i11, str, i12, list);
    }

    public final int component1() {
        return this.page;
    }

    public final String component2() {
        return this.totalListings;
    }

    public final int component3() {
        return this.totalPages;
    }

    public final List<User> component4() {
        return this.users;
    }

    public final FollowResponse copy(int i11, String totalListings, int i12, List<User> users) {
        o.i(totalListings, "totalListings");
        o.i(users, "users");
        return new FollowResponse(i11, totalListings, i12, users);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowResponse)) {
            return false;
        }
        FollowResponse followResponse = (FollowResponse) obj;
        if (this.page == followResponse.page && o.d(this.totalListings, followResponse.totalListings) && this.totalPages == followResponse.totalPages && o.d(this.users, followResponse.users)) {
            return true;
        }
        return false;
    }

    public final int getPage() {
        return this.page;
    }

    public final String getTotalListings() {
        return this.totalListings;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.page) * 31) + this.totalListings.hashCode()) * 31) + Integer.hashCode(this.totalPages)) * 31) + this.users.hashCode();
    }

    public String toString() {
        int i11 = this.page;
        String str = this.totalListings;
        int i12 = this.totalPages;
        List<User> list = this.users;
        return "FollowResponse(page=" + i11 + ", totalListings=" + str + ", totalPages=" + i12 + ", users=" + list + ")";
    }
}
