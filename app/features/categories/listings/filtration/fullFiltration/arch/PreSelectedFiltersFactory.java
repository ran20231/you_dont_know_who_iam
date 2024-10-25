package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import g00.a;
import g00.l;
import hc.b;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: PreSelectedFiltersFactory.kt */
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory {

    /* renamed from: a */
    private final CategoriesRepositories f29133a;

    /* renamed from: b */
    private final ExtraAttributeRawRepository f29134b;

    /* renamed from: c */
    private final DistrictsRepository f29135c;

    /* renamed from: d */
    private final h f29136d;

    public PreSelectedFiltersFactory(CategoriesRepositories categoriesRepositories, ExtraAttributeRawRepository attributesRawRepository, DistrictsRepository districtsRepository) {
        h a11;
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(attributesRawRepository, "attributesRawRepository");
        o.i(districtsRepository, "districtsRepository");
        this.f29133a = categoriesRepositories;
        this.f29134b = attributesRawRepository;
        this.f29135c = districtsRepository;
        a11 = d.a(new a<b>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$rangeHandler$2
            @Override // g00.a
            /* renamed from: b */
            public final b invoke() {
                return new b();
            }
        });
        this.f29136d = a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x003e  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List<? extends cc.a> r10, zz.a<? super java.util.List<java.lang.Integer>> r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.i(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.forsale.app.datalayer.database.CategoryEntity r5, zz.a<? super com.forsale.app.features.postad.location.LocationLevels> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$getMaxLocationLevel$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$getMaxLocationLevel$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$getMaxLocationLevel$1) r0
            int r1 = r0.f29144c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29144c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$getMaxLocationLevel$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$getMaxLocationLevel$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f29142a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29144c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r6 = r4.f29133a
            int r5 = r5.getId()
            r0.f29144c = r3
            java.lang.Object r6 = r6.getCategoryRuleSet(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r6 = (com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet) r6
            if (r6 == 0) goto Lac
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r5 = r6.getLocationSettings()
            if (r5 == 0) goto Lac
            java.util.List r5 = r5.getLevels()
            if (r5 == 0) goto Lac
            boolean r6 = r5.isEmpty()
            r0 = 0
            if (r6 != 0) goto L5b
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto Lac
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r5.next()
            r1 = r6
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r1 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r1
            boolean r1 = r1.getEnabled()
            r1 = r1 ^ r3
            if (r1 == 0) goto L64
            goto L7a
        L79:
            r6 = r0
        L7a:
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r6 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r6
            if (r6 == 0) goto Lac
            int r5 = r6.getLevel()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            int r6 = r5.intValue()
            com.forsale.app.features.postad.location.LocationLevels r1 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
            int r1 = r1.getLevel()
            if (r6 <= r1) goto L94
            r6 = r3
            goto L95
        L94:
            r6 = 0
        L95:
            if (r6 == 0) goto L98
            r0 = r5
        L98:
            if (r0 == 0) goto Lac
            int r5 = r0.intValue()
            int r5 = r5 - r3
            com.forsale.app.features.postad.location.LocationLevels$a r6 = com.forsale.app.features.postad.location.LocationLevels.Companion
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            com.forsale.app.features.postad.location.LocationLevels r5 = r6.a(r5)
            if (r5 == 0) goto Lac
            goto Lae
        Lac:
            com.forsale.app.features.postad.location.LocationLevels r5 = com.forsale.app.features.postad.location.LocationLevels.BLOCK
        Lae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.j(com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    private final b k() {
        return (b) this.f29136d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0062 A[LOOP:0: B:65:0x005c->B:67:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.List<? extends cc.a> r6, com.forsale.app.datalayer.database.CategoryEntity r7, zz.a<? super java.util.List<? extends cc.a>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateBooleanAttributes$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateBooleanAttributes$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateBooleanAttributes$1) r0
            int r1 = r0.f29160d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29160d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateBooleanAttributes$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateBooleanAttributes$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f29158b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29160d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f29157a
            java.util.List r6 = (java.util.List) r6
            kotlin.f.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r8 = r5.f29134b
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r2 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.BOOL
            int r7 = r7.getId()
            r0.f29157a = r6
            r0.f29160d = r3
            java.lang.Object r8 = r8.getAttributesWithCategoryIdOfType(r2, r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.p.y(r8, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L5c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r8.next()
            com.forsale.app.datalayer.database.ExtraAttributeEntity r0 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r0
            int r0 = r0.getId()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r7.add(r0)
            goto L5c
        L74:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L7f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r6.next()
            cc.a r0 = (cc.a) r0
            boolean r1 = r0 instanceof cc.a.AbstractC0196a.C0197a
            if (r1 == 0) goto Lc3
            cc.a$a$a r0 = (cc.a.AbstractC0196a.C0197a) r0
            java.util.List r1 = r0.c()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        La0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbf
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r4 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r4
            int r4 = r4.getId()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto La0
            r2.add(r3)
            goto La0
        Lbf:
            cc.a$a$a r0 = r0.b(r2)
        Lc3:
            if (r0 == 0) goto L7f
            r8.add(r0)
            goto L7f
        Lc9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.m(java.util.List, com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x017d, code lost:
        if (r14.isEmpty() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01cd, code lost:
        if (r13.isEmpty() == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List<cc.a> r19, com.forsale.app.datalayer.database.CategoryEntity r20, zz.a<? super wz.p> r21) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.n(java.util.List, com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    public static final boolean o(l tmp0, Object obj) {
        o.i(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List<? extends cc.a> r5, g00.p<? super java.util.List<cc.a>, ? super zz.a<? super wz.p>, ? extends java.lang.Object> r6, zz.a<? super java.util.List<? extends cc.a>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateFiltersList$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateFiltersList$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateFiltersList$1) r0
            int r1 = r0.f29171d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29171d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateFiltersList$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory$updateFiltersList$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f29169b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29171d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f29168a
            java.util.List r5 = (java.util.List) r5
            kotlin.f.b(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.p.a1(r5)
            r0.f29168a = r5
            r0.f29171d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.p(java.util.List, g00.p, zz.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x015d -> B:118:0x015f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0097 -> B:119:0x0160). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x00c6 -> B:92:0x00d8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0101 -> B:97:0x0104). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.List<? extends cc.a> r18, com.forsale.app.datalayer.database.CategoryEntity r19, zz.a<? super java.util.List<? extends cc.a>> r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.q(java.util.List, com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f4  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0142 -> B:177:0x01ee). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0186 -> B:168:0x0187). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x01ec -> B:176:0x01ed). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.util.List<? extends cc.a> r22, com.forsale.app.datalayer.database.CategoryEntity r23, zz.a<? super java.util.List<? extends cc.a>> r24) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.r(java.util.List, com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118 A[PHI: r2 
      PHI: (r2v16 java.lang.Object) = (r2v15 java.lang.Object), (r2v1 java.lang.Object) binds: [B:95:0x0115, B:66:0x0035] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.List<com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting> r17, java.util.List<? extends cc.a> r18, com.forsale.app.datalayer.database.CategoryEntity r19, zz.a<? super java.util.List<? extends cc.a>> r20) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory.l(java.util.List, java.util.List, com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }
}
