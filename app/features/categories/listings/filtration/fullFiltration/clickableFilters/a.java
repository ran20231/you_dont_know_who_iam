package com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters;

import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.filtration.full.filterModels.ParentGroupModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: FilterCapsule.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final fc.a f29210a;

    /* compiled from: FilterCapsule.kt */
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0319a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final List<dc.c> f29211b;

        /* renamed from: c  reason: collision with root package name */
        private final fc.a f29212c;

        /* compiled from: FilterCapsule.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0320a extends AbstractC0319a {

            /* renamed from: d  reason: collision with root package name */
            private final List<dc.c> f29213d;

            /* renamed from: e  reason: collision with root package name */
            private final fc.a f29214e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0320a(List<dc.c> selectionOptions, fc.a filterCapsuleCommonData) {
                super(selectionOptions, filterCapsuleCommonData, null);
                o.i(selectionOptions, "selectionOptions");
                o.i(filterCapsuleCommonData, "filterCapsuleCommonData");
                this.f29213d = selectionOptions;
                this.f29214e = filterCapsuleCommonData;
            }

            public fc.a a() {
                return this.f29214e;
            }

            public final List<dc.c> b() {
                return this.f29213d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0320a)) {
                    return false;
                }
                C0320a c0320a = (C0320a) obj;
                if (o.d(this.f29213d, c0320a.f29213d) && o.d(this.f29214e, c0320a.f29214e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f29213d.hashCode() * 31) + this.f29214e.hashCode();
            }

            public String toString() {
                List<dc.c> list = this.f29213d;
                fc.a aVar = this.f29214e;
                return "HorizontalSelectionCapsule(selectionOptions=" + list + ", filterCapsuleCommonData=" + aVar + ")";
            }
        }

        /* compiled from: FilterCapsule.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a$b */
        /* loaded from: classes2.dex */
        public static abstract class b extends AbstractC0319a {

            /* renamed from: d  reason: collision with root package name */
            private final List<dc.c> f29215d;

            /* renamed from: e  reason: collision with root package name */
            private final fc.a f29216e;

            /* compiled from: FilterCapsule.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0321a extends b {

                /* renamed from: f  reason: collision with root package name */
                private final List<dc.c> f29217f;

                /* renamed from: g  reason: collision with root package name */
                private final fc.a f29218g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0321a(List<dc.c> options, fc.a filterCapsuleCommonData) {
                    super(options, filterCapsuleCommonData, null);
                    o.i(options, "options");
                    o.i(filterCapsuleCommonData, "filterCapsuleCommonData");
                    this.f29217f = options;
                    this.f29218g = filterCapsuleCommonData;
                }

                @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a.AbstractC0319a.b
                public fc.a a() {
                    return this.f29218g;
                }

                @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a.AbstractC0319a.b
                public List<dc.c> b() {
                    return this.f29217f;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0321a)) {
                        return false;
                    }
                    C0321a c0321a = (C0321a) obj;
                    if (o.d(this.f29217f, c0321a.f29217f) && o.d(this.f29218g, c0321a.f29218g)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return (this.f29217f.hashCode() * 31) + this.f29218g.hashCode();
                }

                public String toString() {
                    List<dc.c> list = this.f29217f;
                    fc.a aVar = this.f29218g;
                    return "GeneralMultiSelectionCapsule(options=" + list + ", filterCapsuleCommonData=" + aVar + ")";
                }
            }

            /* compiled from: FilterCapsule.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0322b extends b {

                /* renamed from: f  reason: collision with root package name */
                private final List<dc.c> f29219f;

                /* renamed from: g  reason: collision with root package name */
                private final List<ParentGroupModel> f29220g;

                /* renamed from: h  reason: collision with root package name */
                private final fc.a f29221h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0322b(List<dc.c> options, List<ParentGroupModel> groups, fc.a filterCapsuleCommonData) {
                    super(options, filterCapsuleCommonData, null);
                    o.i(options, "options");
                    o.i(groups, "groups");
                    o.i(filterCapsuleCommonData, "filterCapsuleCommonData");
                    this.f29219f = options;
                    this.f29220g = groups;
                    this.f29221h = filterCapsuleCommonData;
                }

                @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a.AbstractC0319a.b
                public fc.a a() {
                    return this.f29221h;
                }

                @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a.AbstractC0319a.b
                public List<dc.c> b() {
                    return this.f29219f;
                }

                public final List<ParentGroupModel> c() {
                    return this.f29220g;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0322b)) {
                        return false;
                    }
                    C0322b c0322b = (C0322b) obj;
                    if (o.d(this.f29219f, c0322b.f29219f) && o.d(this.f29220g, c0322b.f29220g) && o.d(this.f29221h, c0322b.f29221h)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return (((this.f29219f.hashCode() * 31) + this.f29220g.hashCode()) * 31) + this.f29221h.hashCode();
                }

                public String toString() {
                    List<dc.c> list = this.f29219f;
                    List<ParentGroupModel> list2 = this.f29220g;
                    fc.a aVar = this.f29221h;
                    return "GroupedMultiSelectionCapsule(options=" + list + ", groups=" + list2 + ", filterCapsuleCommonData=" + aVar + ")";
                }
            }

            public /* synthetic */ b(List list, fc.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, aVar);
            }

            public fc.a a() {
                return this.f29216e;
            }

            public List<dc.c> b() {
                return this.f29215d;
            }

            private b(List<dc.c> list, fc.a aVar) {
                super(list, aVar, null);
                this.f29215d = list;
                this.f29216e = aVar;
            }
        }

        public /* synthetic */ AbstractC0319a(List list, fc.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, aVar);
        }

        private AbstractC0319a(List<dc.c> list, fc.a aVar) {
            super(aVar, null);
            this.f29211b = list;
            this.f29212c = aVar;
        }
    }

    /* compiled from: FilterCapsule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private final List<dc.a> f29222b;

        /* renamed from: c  reason: collision with root package name */
        private final int f29223c;

        /* renamed from: d  reason: collision with root package name */
        private final fc.a f29224d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<dc.a> locations, int i11, fc.a filterCapsuleCommonData) {
            super(filterCapsuleCommonData, null);
            o.i(locations, "locations");
            o.i(filterCapsuleCommonData, "filterCapsuleCommonData");
            this.f29222b = locations;
            this.f29223c = i11;
            this.f29224d = filterCapsuleCommonData;
        }

        public fc.a a() {
            return this.f29224d;
        }

        public final List<dc.a> b() {
            return this.f29222b;
        }

        public final int c() {
            return this.f29223c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f29222b, bVar.f29222b) && this.f29223c == bVar.f29223c && o.d(this.f29224d, bVar.f29224d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f29222b.hashCode() * 31) + Integer.hashCode(this.f29223c)) * 31) + this.f29224d.hashCode();
        }

        public String toString() {
            List<dc.a> list = this.f29222b;
            int i11 = this.f29223c;
            fc.a aVar = this.f29224d;
            return "LocationCapsule(locations=" + list + ", verticalId=" + i11 + ", filterCapsuleCommonData=" + aVar + ")";
        }
    }

    /* compiled from: FilterCapsule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: b  reason: collision with root package name */
        private final GetListingsBody.FiltrationData.Range f29225b;

        /* renamed from: c  reason: collision with root package name */
        private final GetListingsBody.FiltrationData.Range f29226c;

        /* renamed from: d  reason: collision with root package name */
        private final ExtraAttributeEntity.LocalUnit f29227d;

        /* renamed from: e  reason: collision with root package name */
        private final fc.a f29228e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GetListingsBody.FiltrationData.Range rangeLimit, GetListingsBody.FiltrationData.Range range, ExtraAttributeEntity.LocalUnit localUnit, fc.a filterCapsuleCommonData) {
            super(filterCapsuleCommonData, null);
            o.i(rangeLimit, "rangeLimit");
            o.i(filterCapsuleCommonData, "filterCapsuleCommonData");
            this.f29225b = rangeLimit;
            this.f29226c = range;
            this.f29227d = localUnit;
            this.f29228e = filterCapsuleCommonData;
        }

        public fc.a a() {
            return this.f29228e;
        }

        public final GetListingsBody.FiltrationData.Range b() {
            return this.f29226c;
        }

        public final GetListingsBody.FiltrationData.Range c() {
            return this.f29225b;
        }

        public final ExtraAttributeEntity.LocalUnit d() {
            return this.f29227d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.d(this.f29225b, cVar.f29225b) && o.d(this.f29226c, cVar.f29226c) && o.d(this.f29227d, cVar.f29227d) && o.d(this.f29228e, cVar.f29228e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f29225b.hashCode() * 31;
            GetListingsBody.FiltrationData.Range range = this.f29226c;
            int i11 = 0;
            if (range == null) {
                hashCode = 0;
            } else {
                hashCode = range.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            ExtraAttributeEntity.LocalUnit localUnit = this.f29227d;
            if (localUnit != null) {
                i11 = localUnit.hashCode();
            }
            return ((i12 + i11) * 31) + this.f29228e.hashCode();
        }

        public String toString() {
            GetListingsBody.FiltrationData.Range range = this.f29225b;
            GetListingsBody.FiltrationData.Range range2 = this.f29226c;
            ExtraAttributeEntity.LocalUnit localUnit = this.f29227d;
            fc.a aVar = this.f29228e;
            return "RangeCapsule(rangeLimit=" + range + ", preSelectedRange=" + range2 + ", unit=" + localUnit + ", filterCapsuleCommonData=" + aVar + ")";
        }
    }

    public /* synthetic */ a(fc.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private a(fc.a aVar) {
        this.f29210a = aVar;
    }
}
