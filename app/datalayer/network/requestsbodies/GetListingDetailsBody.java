package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.utils.Languages;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetListingDetailsBody.kt */
/* loaded from: classes2.dex */
public final class GetListingDetailsBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @c(GetListingsBaseBody.ADV_ID)
    private final Integer advId;
    @c("intention")
    private final PostListingIntention intention;
    private final Languages lang;
    @c(CategoryEntity.SLUG)
    private final String slug;

    /* compiled from: GetListingDetailsBody.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ GetListingDetailsBody createListingDetails$default(Companion companion, ListingDetailsType listingDetailsType, Languages languages, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                postListingIntention = null;
            }
            return companion.createListingDetails(listingDetailsType, languages, postListingIntention);
        }

        public final GetListingDetailsBody createListingDetails(ListingDetailsType type, Languages lang, PostListingIntention postListingIntention) {
            o.i(type, "type");
            o.i(lang, "lang");
            if (type instanceof ListingDetailsType.Slug) {
                return new GetListingDetailsBody(null, lang, postListingIntention, ((ListingDetailsType.Slug) type).getSlug(), 1, null);
            }
            if (type instanceof ListingDetailsType.AdvId) {
                return new GetListingDetailsBody(Integer.valueOf(((ListingDetailsType.AdvId) type).getAdvId()), lang, postListingIntention, null, 8, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private GetListingDetailsBody(Integer num, Languages languages, PostListingIntention postListingIntention, String str) {
        this.advId = num;
        this.lang = languages;
        this.intention = postListingIntention;
        this.slug = str;
    }

    public static /* synthetic */ GetListingDetailsBody copy$default(GetListingDetailsBody getListingDetailsBody, Integer num, Languages languages, PostListingIntention postListingIntention, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = getListingDetailsBody.advId;
        }
        if ((i11 & 2) != 0) {
            languages = getListingDetailsBody.lang;
        }
        if ((i11 & 4) != 0) {
            postListingIntention = getListingDetailsBody.intention;
        }
        if ((i11 & 8) != 0) {
            str = getListingDetailsBody.slug;
        }
        return getListingDetailsBody.copy(num, languages, postListingIntention, str);
    }

    public final Integer component1() {
        return this.advId;
    }

    public final Languages component2() {
        return this.lang;
    }

    public final PostListingIntention component3() {
        return this.intention;
    }

    public final String component4() {
        return this.slug;
    }

    public final GetListingDetailsBody copy(Integer num, Languages lang, PostListingIntention postListingIntention, String str) {
        o.i(lang, "lang");
        return new GetListingDetailsBody(num, lang, postListingIntention, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetListingDetailsBody)) {
            return false;
        }
        GetListingDetailsBody getListingDetailsBody = (GetListingDetailsBody) obj;
        if (o.d(this.advId, getListingDetailsBody.advId) && this.lang == getListingDetailsBody.lang && this.intention == getListingDetailsBody.intention && o.d(this.slug, getListingDetailsBody.slug)) {
            return true;
        }
        return false;
    }

    public final Integer getAdvId() {
        return this.advId;
    }

    public final PostListingIntention getIntention() {
        return this.intention;
    }

    public final Languages getLang() {
        return this.lang;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.advId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.lang.hashCode()) * 31;
        PostListingIntention postListingIntention = this.intention;
        if (postListingIntention == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = postListingIntention.hashCode();
        }
        int i12 = (hashCode3 + hashCode2) * 31;
        String str = this.slug;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Integer num = this.advId;
        Languages languages = this.lang;
        PostListingIntention postListingIntention = this.intention;
        String str = this.slug;
        return "GetListingDetailsBody(advId=" + num + ", lang=" + languages + ", intention=" + postListingIntention + ", slug=" + str + ")";
    }

    /* synthetic */ GetListingDetailsBody(Integer num, Languages languages, PostListingIntention postListingIntention, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, languages, (i11 & 4) != 0 ? null : postListingIntention, (i11 & 8) != 0 ? null : str);
    }
}
