package com.forsale.app.features.categories.home.propertyhome.interactors;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributesRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.l;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.w;
import kotlin.jvm.internal.o;
import wz.i;
import xa.b;
/* compiled from: RecommendedSectionsInterActor.kt */
/* loaded from: classes2.dex */
public final class RecommendedSectionsInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingsRepository f25035a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRepositories f25036b;

    /* renamed from: c  reason: collision with root package name */
    private final DistrictsRepository f25037c;

    /* renamed from: d  reason: collision with root package name */
    private final ExtraAttributesRepository f25038d;

    /* renamed from: e  reason: collision with root package name */
    private final ExtraAttributeRawRepository f25039e;

    /* renamed from: f  reason: collision with root package name */
    private List<ListingItemBrief.AttrInfo> f25040f;

    /* renamed from: g  reason: collision with root package name */
    private List<CategoryEntity> f25041g;

    /* renamed from: h  reason: collision with root package name */
    private List<DistrictEntity> f25042h;

    /* renamed from: i  reason: collision with root package name */
    private b f25043i;

    /* compiled from: RecommendedSectionsInterActor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25044a;

        static {
            int[] iArr = new int[ListingsResponse.UISettings.FiltrationSetting.FilterType.values().length];
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.CATEGORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.SUB_CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.DISTRICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.AREA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.AREA_BLOCK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.LOCATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.PRICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.FilterType.ATTRIBUTE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f25044a = iArr;
        }
    }

    public RecommendedSectionsInterActor(ListingsRepository listingsRepository, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, ExtraAttributesRepository extraAttributesRepository, ExtraAttributeRawRepository extraAttributeRawRepository) {
        List<ListingItemBrief.AttrInfo> n11;
        List<CategoryEntity> n12;
        List<DistrictEntity> n13;
        o.i(listingsRepository, "listingsRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(districtsRepository, "districtsRepository");
        o.i(extraAttributesRepository, "extraAttributesRepository");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        this.f25035a = listingsRepository;
        this.f25036b = categoriesRepositories;
        this.f25037c = districtsRepository;
        this.f25038d = extraAttributesRepository;
        this.f25039e = extraAttributeRawRepository;
        n11 = r.n();
        this.f25040f = n11;
        n12 = r.n();
        this.f25041g = n12;
        n13 = r.n();
        this.f25042h = n13;
        this.f25043i = new b();
    }

    private final Object d(List<RecommendedSectionsResponse.Section> list, zz.a<? super List<ListingItemBrief.AttrInfo>> aVar) {
        return l(list, aVar);
    }

    private final Object e(List<Integer> list, zz.a<? super List<CategoryEntity>> aVar) {
        return this.f25036b.getCategoriesByIds(list, aVar);
    }

    private final List<RecommendedSectionsResponse.SectionFilter> f(List<RecommendedSectionsResponse.Section> list) {
        List<? extends ListingsResponse.UISettings.FiltrationSetting.FilterType> q11;
        q11 = r.q(ListingsResponse.UISettings.FiltrationSetting.FilterType.CATEGORY, ListingsResponse.UISettings.FiltrationSetting.FilterType.SUB_CATEGORY);
        return p(list, q11);
    }

    private final Object g(List<Integer> list, zz.a<? super List<DistrictEntity>> aVar) {
        return this.f25037c.getDistrictsByIds(list, aVar);
    }

    private final List<RecommendedSectionsResponse.SectionFilter> h(List<RecommendedSectionsResponse.Section> list) {
        List<? extends ListingsResponse.UISettings.FiltrationSetting.FilterType> q11;
        q11 = r.q(ListingsResponse.UISettings.FiltrationSetting.FilterType.DISTRICT, ListingsResponse.UISettings.FiltrationSetting.FilterType.AREA, ListingsResponse.UISettings.FiltrationSetting.FilterType.AREA_BLOCK);
        return p(list, q11);
    }

    private final Pair<String, String> i(RecommendedSectionsResponse.SectionFilter sectionFilter) {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        Pair<String, String> attributeDisplayTextLocalized;
        Pair<String, String> attributeDisplayTextLocalized2;
        boolean z11;
        Iterator<T> it2 = this.f25040f.iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                obj = it2.next();
                if (((ListingItemBrief.AttrInfo) obj).getId() == Integer.parseInt(sectionFilter.getId())) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ListingItemBrief.AttrInfo attrInfo = (ListingItemBrief.AttrInfo) obj;
        if (attrInfo != null && (attributeDisplayTextLocalized2 = attrInfo.getAttributeDisplayTextLocalized()) != null) {
            str2 = attributeDisplayTextLocalized2.c();
        } else {
            str2 = null;
        }
        if (attrInfo != null) {
            str3 = attrInfo.getNameEn();
        } else {
            str3 = null;
        }
        String str5 = str2 + " " + str3;
        if (attrInfo != null && (attributeDisplayTextLocalized = attrInfo.getAttributeDisplayTextLocalized()) != null) {
            str4 = attributeDisplayTextLocalized.d();
        } else {
            str4 = null;
        }
        if (attrInfo != null) {
            str = attrInfo.getNameAr();
        }
        return new Pair<>(str5, str4 + " " + str + " ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief.AttrInfo> r6, zz.a<? super java.util.List<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$getAttributeOptions$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$getAttributeOptions$1 r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$getAttributeOptions$1) r0
            int r1 = r0.f25047c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25047c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$getAttributeOptions$1 r0 = new com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$getAttributeOptions$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25045a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25047c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L73
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.f.b(r7)
            r7 = 0
            if (r6 == 0) goto L7c
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r5.f25039e
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r4 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.DROP_DOWN
            java.util.List r6 = com.forsale.app.utils.TypeExtensionsKt.k(r6, r4)
            if (r6 == 0) goto L6a
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.p.y(r6, r4)
            r7.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r6.next()
            com.forsale.app.datalayer.network.responses.ListingItemBrief$AttrInfo r4 = (com.forsale.app.datalayer.network.responses.ListingItemBrief.AttrInfo) r4
            int r4 = r4.getId()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            r7.add(r4)
            goto L52
        L6a:
            r0.f25047c = r3
            java.lang.Object r7 = r2.getExtraAttributeOptionsListByAttributeIds(r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L7c
            java.util.List r6 = kotlin.collections.p.n()
            r7 = r6
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor.j(java.util.List, zz.a):java.lang.Object");
    }

    private final String k(int i11, List<Pair<Integer, String>> list) {
        Object obj;
        boolean z11;
        if (list == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((Number) ((Pair) obj).c()).intValue() == i11) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return null;
        }
        return (String) pair.d();
    }

    private final Object l(List<RecommendedSectionsResponse.Section> list, zz.a<? super List<ListingItemBrief.AttrInfo>> aVar) {
        List<? extends ListingsResponse.UISettings.FiltrationSetting.FilterType> e11;
        e11 = q.e(ListingsResponse.UISettings.FiltrationSetting.FilterType.ATTRIBUTE);
        return w(p(list, e11), aVar);
    }

    private final Object m(int i11, zz.a<? super CategoryEntity> aVar) {
        return this.f25036b.getCategory(i11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.SectionFilter r8, zz.a<? super kotlin.Pair<java.lang.String, java.lang.String>> r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor.n(com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse$SectionFilter, zz.a):java.lang.Object");
    }

    private final Object o(RecommendedSectionsResponse.SectionFilter sectionFilter, zz.a<? super Pair<String, String>> aVar) {
        String str;
        Object obj;
        String str2;
        String fullPathAr;
        String fullPathEn;
        boolean z11;
        Iterator<T> it2 = this.f25042h.iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                obj = it2.next();
                if (((DistrictEntity) obj).getId() == Integer.parseInt(sectionFilter.getId())) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        DistrictEntity districtEntity = (DistrictEntity) obj;
        if (districtEntity != null && (fullPathEn = districtEntity.getFullPathEn()) != null) {
            str2 = TypeExtensionsKt.T0(fullPathEn, false, false, 3, null);
        } else {
            str2 = null;
        }
        String str3 = str2 + ", ";
        if (districtEntity != null && (fullPathAr = districtEntity.getFullPathAr()) != null) {
            str = TypeExtensionsKt.T0(fullPathAr, false, false, 3, null);
        }
        return new Pair(str3, str + ", ");
    }

    private final List<RecommendedSectionsResponse.SectionFilter> p(List<RecommendedSectionsResponse.Section> list, List<? extends ListingsResponse.UISettings.FiltrationSetting.FilterType> list2) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        for (RecommendedSectionsResponse.Section section : list) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : section.getFilters()) {
                RecommendedSectionsResponse.SectionFilter sectionFilter = (RecommendedSectionsResponse.SectionFilter) obj;
                List<? extends ListingsResponse.UISettings.FiltrationSetting.FilterType> list3 = list2;
                boolean z12 = false;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((ListingsResponse.UISettings.FiltrationSetting.FilterType) it2.next()) == sectionFilter.getFilterType()) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z12 = true;
                            break;
                        }
                    }
                }
                if (z12) {
                    arrayList2.add(obj);
                }
            }
            w.D(arrayList, arrayList2);
        }
        return arrayList;
    }

    private final List<ListingItemBrief.AttrInfo> r(List<ListingItemBrief.AttrInfo> list, List<Pair<Integer, String>> list2) {
        List n11;
        int y11;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ListingItemBrief.AttrInfo attrInfo = (ListingItemBrief.AttrInfo) obj;
                if (list2 == null) {
                    n11 = r.n();
                } else {
                    List<Pair<Integer, String>> list3 = list2;
                    y11 = s.y(list3, 10);
                    n11 = new ArrayList(y11);
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        n11.add(Integer.valueOf(((Number) ((Pair) it2.next()).c()).intValue()));
                    }
                }
                if (n11.contains(Integer.valueOf(attrInfo.getId()))) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    private final Object s(Integer num, zz.a<? super CategoryEntity> aVar) {
        if (num != null && num.intValue() != 0) {
            return m(num.intValue(), aVar);
        }
        return null;
    }

    private final Pair<String, String> t(RecommendedSectionsResponse.SectionFilter sectionFilter) {
        return new Pair<>(sectionFilter.getValue() + " " + this.f25043i.b().getRegionCodeEn() + ", ", l.a(sectionFilter.getValue()) + " " + this.f25043i.b().getRegionCodeAr() + ", ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[LOOP:0: B:29:0x00b8->B:31:0x00be, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.List<com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.SectionFilter> r9, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief.AttrInfo>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$handleAttributes$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$handleAttributes$1 r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$handleAttributes$1) r0
            int r1 = r0.f25065f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25065f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$handleAttributes$1 r0 = new com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor$handleAttributes$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f25063d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25065f
            r3 = 10
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r9 = r0.f25062c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r1 = r0.f25061b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f25060a
            com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor) r0
            kotlin.f.b(r10)
            goto La7
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            java.lang.Object r9 = r0.f25061b
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f25060a
            com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor r2 = (com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor) r2
            kotlin.f.b(r10)
            goto L8e
        L4f:
            kotlin.f.b(r10)
            com.forsale.app.datalayer.repositories.ExtraAttributesRepository r10 = r8.f25038d
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.p.y(r2, r3)
            r6.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L64:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L80
            java.lang.Object r7 = r2.next()
            com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse$SectionFilter r7 = (com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.SectionFilter) r7
            java.lang.String r7 = r7.getId()
            int r7 = java.lang.Integer.parseInt(r7)
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r7)
            r6.add(r7)
            goto L64
        L80:
            r0.f25060a = r8
            r0.f25061b = r9
            r0.f25065f = r5
            java.lang.Object r10 = r10.getAttributesByIdListSuspend(r6, r0)
            if (r10 != r1) goto L8d
            return r1
        L8d:
            r2 = r8
        L8e:
            java.util.List r10 = (java.util.List) r10
            java.util.List r10 = r2.x(r10)
            r0.f25060a = r2
            r0.f25061b = r9
            r0.f25062c = r10
            r0.f25065f = r4
            java.lang.Object r0 = r2.j(r10, r0)
            if (r0 != r1) goto La3
            return r1
        La3:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
        La7:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.p.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        Lb8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r1.next()
            com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse$SectionFilter r3 = (com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.SectionFilter) r3
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = r3.getId()
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.lang.String r3 = r3.getValue()
            r4.<init>(r5, r3)
            r2.add(r4)
            goto Lb8
        Ldd:
            java.util.List r9 = r0.z(r9, r10, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor.w(java.util.List, zz.a):java.lang.Object");
    }

    private final List<ListingItemBrief.AttrInfo> x(List<ExtraAttributeEntity> list) {
        int y11;
        List<ExtraAttributeEntity> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ExtraAttributeEntity extraAttributeEntity : list2) {
            arrayList.add(new ListingItemBrief.AttrInfo(extraAttributeEntity.getId(), extraAttributeEntity.getNameEn(), extraAttributeEntity.getNameAr(), AttributeType.Companion.a(extraAttributeEntity.getType()), extraAttributeEntity.getImage(), "", extraAttributeEntity.getUnit(), null));
        }
        return arrayList;
    }

    private final List<ListingItemBrief.AttrInfo> z(List<ListingItemBrief.AttrInfo> list, List<ExtraAttributeOptionEntity> list2, List<Pair<Integer, String>> list3) {
        int y11;
        ExtraAttributeOptionEntity extraAttributeOptionEntity;
        Object obj;
        List<ListingItemBrief.AttrInfo> r11 = r(list, list3);
        if (r11 == null) {
            return null;
        }
        List<ListingItemBrief.AttrInfo> list4 = r11;
        y11 = s.y(list4, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ListingItemBrief.AttrInfo attrInfo : list4) {
            String k11 = k(attrInfo.getId(), list3);
            if (k11 == null) {
                k11 = "";
            }
            String str = k11;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (o.d(String.valueOf(((ExtraAttributeOptionEntity) obj).getId()), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                extraAttributeOptionEntity = (ExtraAttributeOptionEntity) obj;
            } else {
                extraAttributeOptionEntity = null;
            }
            arrayList.add(ListingItemBrief.AttrInfo.copy$default(attrInfo, 0, null, null, null, null, str, null, extraAttributeOptionEntity, 95, null));
        }
        return arrayList;
    }

    public final Pair<List<String>, List<String>> q(List<RecommendedSectionsResponse.SectionFilter> filters) {
        int y11;
        int e11;
        int d11;
        List X0;
        List X02;
        String value;
        o.i(filters, "filters");
        List<RecommendedSectionsResponse.SectionFilter> list = filters;
        y11 = s.y(list, 10);
        e11 = i0.e(y11);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (RecommendedSectionsResponse.SectionFilter sectionFilter : list) {
            if (o.d(sectionFilter.getAttrType(), Constants.Kinds.BOOLEAN)) {
                value = String.valueOf(TypeExtensionsKt.h0((int) Double.parseDouble(sectionFilter.getValue())));
            } else {
                value = sectionFilter.getValue();
            }
            Pair a11 = i.a(sectionFilter.getNameEn(), value);
            linkedHashMap.put(a11.c(), a11.d());
        }
        X0 = CollectionsKt___CollectionsKt.X0(linkedHashMap.keySet());
        X02 = CollectionsKt___CollectionsKt.X0(linkedHashMap.values());
        return i.a(X0, X02);
    }

    public final Object u(int i11, zz.a<? super RecommendedSectionsResponse> aVar) {
        return this.f25035a.getRecommendedSections(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00de -> B:27:0x00e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0109 -> B:17:0x0084). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.Section r12, zz.a<? super com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.SectionTitleTrailing> r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor.v(com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse$Section, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[LOOP:1: B:26:0x00a3->B:28:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[LOOP:0: B:34:0x00e9->B:36:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.util.List<com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse.Section> r9, xa.b r10, zz.a<? super wz.p> r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.RecommendedSectionsInterActor.y(java.util.List, xa.b, zz.a):java.lang.Object");
    }
}
