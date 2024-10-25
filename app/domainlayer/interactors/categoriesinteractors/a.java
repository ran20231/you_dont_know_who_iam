package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs;
import java.util.List;
import kotlin.jvm.internal.o;
import zc.b;
/* compiled from: HomeVerticalSectionModel.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f22441a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22442b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C0252a> f22443c;

    /* renamed from: d  reason: collision with root package name */
    private final CategoryEntity f22444d;

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f22445e;

    /* renamed from: f  reason: collision with root package name */
    private final VerticalSectionsTabs f22446f;

    /* compiled from: HomeVerticalSectionModel.kt */
    /* renamed from: com.forsale.app.domainlayer.interactors.categoriesinteractors.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0252a {

        /* renamed from: a  reason: collision with root package name */
        private final int f22447a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f22448b;

        /* renamed from: c  reason: collision with root package name */
        private final VerticalSectionsTabs f22449c;

        public C0252a(int i11, boolean z11, VerticalSectionsTabs type) {
            o.i(type, "type");
            this.f22447a = i11;
            this.f22448b = z11;
            this.f22449c = type;
        }

        public static /* synthetic */ C0252a b(C0252a c0252a, int i11, boolean z11, VerticalSectionsTabs verticalSectionsTabs, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = c0252a.f22447a;
            }
            if ((i12 & 2) != 0) {
                z11 = c0252a.f22448b;
            }
            if ((i12 & 4) != 0) {
                verticalSectionsTabs = c0252a.f22449c;
            }
            return c0252a.a(i11, z11, verticalSectionsTabs);
        }

        public final C0252a a(int i11, boolean z11, VerticalSectionsTabs type) {
            o.i(type, "type");
            return new C0252a(i11, z11, type);
        }

        public final int c() {
            return this.f22447a;
        }

        public final VerticalSectionsTabs d() {
            return this.f22449c;
        }

        public final boolean e() {
            return this.f22448b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0252a)) {
                return false;
            }
            C0252a c0252a = (C0252a) obj;
            if (this.f22447a == c0252a.f22447a && this.f22448b == c0252a.f22448b && this.f22449c == c0252a.f22449c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.f22447a) * 31;
            boolean z11 = this.f22448b;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((hashCode + i11) * 31) + this.f22449c.hashCode();
        }

        public String toString() {
            int i11 = this.f22447a;
            boolean z11 = this.f22448b;
            VerticalSectionsTabs verticalSectionsTabs = this.f22449c;
            return "HomeSectionTabs(title=" + i11 + ", isSelected=" + z11 + ", type=" + verticalSectionsTabs + ")";
        }
    }

    public a(String titleAr, String titleEn, List<C0252a> tabs, CategoryEntity category, List<b> userAds, VerticalSectionsTabs defaultTabType) {
        o.i(titleAr, "titleAr");
        o.i(titleEn, "titleEn");
        o.i(tabs, "tabs");
        o.i(category, "category");
        o.i(userAds, "userAds");
        o.i(defaultTabType, "defaultTabType");
        this.f22441a = titleAr;
        this.f22442b = titleEn;
        this.f22443c = tabs;
        this.f22444d = category;
        this.f22445e = userAds;
        this.f22446f = defaultTabType;
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, List list, CategoryEntity categoryEntity, List list2, VerticalSectionsTabs verticalSectionsTabs, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f22441a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f22442b;
        }
        String str3 = str2;
        List<C0252a> list3 = list;
        if ((i11 & 4) != 0) {
            list3 = aVar.f22443c;
        }
        List list4 = list3;
        if ((i11 & 8) != 0) {
            categoryEntity = aVar.f22444d;
        }
        CategoryEntity categoryEntity2 = categoryEntity;
        List<b> list5 = list2;
        if ((i11 & 16) != 0) {
            list5 = aVar.f22445e;
        }
        List list6 = list5;
        if ((i11 & 32) != 0) {
            verticalSectionsTabs = aVar.f22446f;
        }
        return aVar.a(str, str3, list4, categoryEntity2, list6, verticalSectionsTabs);
    }

    public final a a(String titleAr, String titleEn, List<C0252a> tabs, CategoryEntity category, List<b> userAds, VerticalSectionsTabs defaultTabType) {
        o.i(titleAr, "titleAr");
        o.i(titleEn, "titleEn");
        o.i(tabs, "tabs");
        o.i(category, "category");
        o.i(userAds, "userAds");
        o.i(defaultTabType, "defaultTabType");
        return new a(titleAr, titleEn, tabs, category, userAds, defaultTabType);
    }

    public final CategoryEntity c() {
        return this.f22444d;
    }

    public final VerticalSectionsTabs d() {
        return this.f22446f;
    }

    public final List<C0252a> e() {
        return this.f22443c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.d(this.f22441a, aVar.f22441a) && o.d(this.f22442b, aVar.f22442b) && o.d(this.f22443c, aVar.f22443c) && o.d(this.f22444d, aVar.f22444d) && o.d(this.f22445e, aVar.f22445e) && this.f22446f == aVar.f22446f) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f22441a;
    }

    public final String g() {
        return this.f22442b;
    }

    public final List<b> h() {
        return this.f22445e;
    }

    public int hashCode() {
        return (((((((((this.f22441a.hashCode() * 31) + this.f22442b.hashCode()) * 31) + this.f22443c.hashCode()) * 31) + this.f22444d.hashCode()) * 31) + this.f22445e.hashCode()) * 31) + this.f22446f.hashCode();
    }

    public String toString() {
        String str = this.f22441a;
        String str2 = this.f22442b;
        List<C0252a> list = this.f22443c;
        CategoryEntity categoryEntity = this.f22444d;
        List<b> list2 = this.f22445e;
        VerticalSectionsTabs verticalSectionsTabs = this.f22446f;
        return "HomeVerticalSectionModel(titleAr=" + str + ", titleEn=" + str2 + ", tabs=" + list + ", category=" + categoryEntity + ", userAds=" + list2 + ", defaultTabType=" + verticalSectionsTabs + ")";
    }
}
