package com.forsale.app.features.categories.listings.category;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CategoryListingsAnalyticSource.kt */
/* loaded from: classes2.dex */
public abstract class CategoryListingsAnalyticSource implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final String f28079a;

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class BreadcrumbsSearchCategory extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<BreadcrumbsSearchCategory> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28080c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28081b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BreadcrumbsSearchCategory> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final BreadcrumbsSearchCategory createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new BreadcrumbsSearchCategory(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final BreadcrumbsSearchCategory[] newArray(int i11) {
                return new BreadcrumbsSearchCategory[i11];
            }
        }

        public BreadcrumbsSearchCategory() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28081b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof BreadcrumbsSearchCategory) && o.d(this.f28081b, ((BreadcrumbsSearchCategory) obj).f28081b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28081b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28081b;
            return "BreadcrumbsSearchCategory(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28081b);
        }

        public BreadcrumbsSearchCategory(String str) {
            super("Search Breadcrumbs", null);
            this.f28081b = str;
        }

        public /* synthetic */ BreadcrumbsSearchCategory(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class ContinueBrowsingSearchCategory extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<ContinueBrowsingSearchCategory> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28082c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28083b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ContinueBrowsingSearchCategory> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final ContinueBrowsingSearchCategory createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new ContinueBrowsingSearchCategory(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final ContinueBrowsingSearchCategory[] newArray(int i11) {
                return new ContinueBrowsingSearchCategory[i11];
            }
        }

        public ContinueBrowsingSearchCategory() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28083b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ContinueBrowsingSearchCategory) && o.d(this.f28083b, ((ContinueBrowsingSearchCategory) obj).f28083b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28083b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28083b;
            return "ContinueBrowsingSearchCategory(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28083b);
        }

        public ContinueBrowsingSearchCategory(String str) {
            super("Continue Browsing", null);
            this.f28083b = str;
        }

        public /* synthetic */ ContinueBrowsingSearchCategory(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class DirectLink extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<DirectLink> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28084c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28085b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<DirectLink> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DirectLink createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new DirectLink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final DirectLink[] newArray(int i11) {
                return new DirectLink[i11];
            }
        }

        public DirectLink() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28085b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28085b);
        }

        public DirectLink(String str) {
            super("Direct Link", null);
            this.f28085b = str;
        }

        public /* synthetic */ DirectLink(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class ListingDetailsBreadcrumbs extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<ListingDetailsBreadcrumbs> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28086c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28087b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ListingDetailsBreadcrumbs> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final ListingDetailsBreadcrumbs createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new ListingDetailsBreadcrumbs(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final ListingDetailsBreadcrumbs[] newArray(int i11) {
                return new ListingDetailsBreadcrumbs[i11];
            }
        }

        public ListingDetailsBreadcrumbs() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28087b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ListingDetailsBreadcrumbs) && o.d(this.f28087b, ((ListingDetailsBreadcrumbs) obj).f28087b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28087b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28087b;
            return "ListingDetailsBreadcrumbs(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28087b);
        }

        public ListingDetailsBreadcrumbs(String str) {
            super("Listing Details Breadcrumbs", null);
            this.f28087b = str;
        }

        public /* synthetic */ ListingDetailsBreadcrumbs(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class ListingDetailsSimilarAdsSeeAll extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<ListingDetailsSimilarAdsSeeAll> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28088c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28089b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ListingDetailsSimilarAdsSeeAll> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final ListingDetailsSimilarAdsSeeAll createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new ListingDetailsSimilarAdsSeeAll(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final ListingDetailsSimilarAdsSeeAll[] newArray(int i11) {
                return new ListingDetailsSimilarAdsSeeAll[i11];
            }
        }

        public ListingDetailsSimilarAdsSeeAll() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28089b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ListingDetailsSimilarAdsSeeAll) && o.d(this.f28089b, ((ListingDetailsSimilarAdsSeeAll) obj).f28089b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28089b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28089b;
            return "ListingDetailsSimilarAdsSeeAll(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28089b);
        }

        public ListingDetailsSimilarAdsSeeAll(String str) {
            super("Listing Details Category See All", null);
            this.f28089b = str;
        }

        public /* synthetic */ ListingDetailsSimilarAdsSeeAll(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class RecentSearchCategory extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<RecentSearchCategory> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28090c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28091b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<RecentSearchCategory> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final RecentSearchCategory createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new RecentSearchCategory(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final RecentSearchCategory[] newArray(int i11) {
                return new RecentSearchCategory[i11];
            }
        }

        public RecentSearchCategory() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28091b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof RecentSearchCategory) && o.d(this.f28091b, ((RecentSearchCategory) obj).f28091b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28091b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28091b;
            return "RecentSearchCategory(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28091b);
        }

        public RecentSearchCategory(String str) {
            super("Recent Search Categories", null);
            this.f28091b = str;
        }

        public /* synthetic */ RecentSearchCategory(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class SearchCategory extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<SearchCategory> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28092c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28093b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<SearchCategory> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final SearchCategory createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new SearchCategory(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final SearchCategory[] newArray(int i11) {
                return new SearchCategory[i11];
            }
        }

        public SearchCategory() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28093b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SearchCategory) && o.d(this.f28093b, ((SearchCategory) obj).f28093b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28093b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28093b;
            return "SearchCategory(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28093b);
        }

        public SearchCategory(String str) {
            super("Search Category", null);
            this.f28093b = str;
        }

        public /* synthetic */ SearchCategory(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class SearchMode extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<SearchMode> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28094c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28095b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<SearchMode> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final SearchMode createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new SearchMode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final SearchMode[] newArray(int i11) {
                return new SearchMode[i11];
            }
        }

        public SearchMode() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28095b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SearchMode) && o.d(this.f28095b, ((SearchMode) obj).f28095b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f28095b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f28095b;
            return "SearchMode(sectionName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28095b);
        }

        public SearchMode(String str) {
            super("Search Mode", null);
            this.f28095b = str;
        }

        public /* synthetic */ SearchMode(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class SubCategoryPage extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<SubCategoryPage> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28096c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28097b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<SubCategoryPage> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final SubCategoryPage createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new SubCategoryPage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final SubCategoryPage[] newArray(int i11) {
                return new SubCategoryPage[i11];
            }
        }

        public SubCategoryPage() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28097b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28097b);
        }

        public SubCategoryPage(String str) {
            super("Sub-Category", null);
            this.f28097b = str;
        }

        public /* synthetic */ SubCategoryPage(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: CategoryListingsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class VerticalPage extends CategoryListingsAnalyticSource {
        public static final Parcelable.Creator<VerticalPage> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f28098c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f28099b;

        /* compiled from: CategoryListingsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<VerticalPage> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final VerticalPage createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new VerticalPage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final VerticalPage[] newArray(int i11) {
                return new VerticalPage[i11];
            }
        }

        public VerticalPage() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource
        public String b() {
            return this.f28099b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f28099b);
        }

        public VerticalPage(String str) {
            super("Vertical Page", null);
            this.f28099b = str;
        }

        public /* synthetic */ VerticalPage(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ CategoryListingsAnalyticSource(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f28079a;
    }

    public abstract String b();

    private CategoryListingsAnalyticSource(String str) {
        this.f28079a = str;
    }
}
