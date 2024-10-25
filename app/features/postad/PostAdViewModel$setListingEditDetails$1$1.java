package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$setListingEditDetails$1$1", f = "PostAdViewModel.kt", l = {661, 665, 669}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$setListingEditDetails$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34162a;

    /* renamed from: b  reason: collision with root package name */
    Object f34163b;

    /* renamed from: c  reason: collision with root package name */
    Object f34164c;

    /* renamed from: d  reason: collision with root package name */
    int f34165d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34166e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f34167f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$setListingEditDetails$1$1(PostAdViewModel postAdViewModel, int i11, zz.a<? super PostAdViewModel$setListingEditDetails$1$1> aVar) {
        super(2, aVar);
        this.f34166e = postAdViewModel;
        this.f34167f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$setListingEditDetails$1$1(this.f34166e, this.f34167f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f34165d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            java.lang.Object r0 = r6.f34164c
            com.forsale.app.datalayer.database.DistrictEntity r0 = (com.forsale.app.datalayer.database.DistrictEntity) r0
            java.lang.Object r1 = r6.f34163b
            com.forsale.app.datalayer.database.DistrictEntity r1 = (com.forsale.app.datalayer.database.DistrictEntity) r1
            java.lang.Object r1 = r6.f34162a
            com.forsale.app.features.postad.PostAdViewModel r1 = (com.forsale.app.features.postad.PostAdViewModel) r1
            kotlin.f.b(r7)
            goto Lae
        L23:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2b:
            java.lang.Object r1 = r6.f34162a
            com.forsale.app.features.postad.PostAdViewModel r1 = (com.forsale.app.features.postad.PostAdViewModel) r1
            kotlin.f.b(r7)
            goto L7f
        L33:
            kotlin.f.b(r7)
            goto L4b
        L37:
            kotlin.f.b(r7)
            com.forsale.app.features.postad.PostAdViewModel r7 = r6.f34166e
            com.forsale.app.datalayer.repositories.CategoriesRepositories r7 = com.forsale.app.features.postad.PostAdViewModel.x0(r7)
            int r1 = r6.f34167f
            r6.f34165d = r4
            java.lang.Object r7 = r7.getCategory(r1, r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            com.forsale.app.datalayer.database.CategoryEntity r7 = (com.forsale.app.datalayer.database.CategoryEntity) r7
            if (r7 == 0) goto L54
            com.forsale.app.features.postad.PostAdViewModel r1 = r6.f34166e
            r1.r4(r7, r5)
        L54:
            com.forsale.app.features.postad.PostAdViewModel r7 = r6.f34166e
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r7 = r7.n2()
            if (r7 == 0) goto Lbd
            java.util.List r7 = r7.getDistrictsIds()
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = kotlin.collections.p.m0(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto Lbd
            com.forsale.app.features.postad.PostAdViewModel r1 = r6.f34166e
            int r7 = r7.intValue()
            com.forsale.app.datalayer.repositories.DistrictsRepository r4 = com.forsale.app.features.postad.PostAdViewModel.y0(r1)
            r6.f34162a = r1
            r6.f34165d = r3
            java.lang.Object r7 = r4.getDistrictByDistrictId(r7, r6)
            if (r7 != r0) goto L7f
            return r0
        L7f:
            com.forsale.app.datalayer.database.DistrictEntity r7 = (com.forsale.app.datalayer.database.DistrictEntity) r7
            if (r7 == 0) goto Lbd
            int r3 = r7.getLevel()
            com.forsale.app.features.postad.location.LocationLevels r4 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
            int r4 = r4.getLevel()
            if (r3 != r4) goto L93
            r1.t4(r7, r7, r5)
            goto Lbd
        L93:
            java.lang.String r3 = r7.getParents()
            if (r3 == 0) goto Lbd
            com.forsale.app.datalayer.repositories.DistrictsRepository r4 = com.forsale.app.features.postad.PostAdViewModel.y0(r1)
            r6.f34162a = r1
            r6.f34163b = r7
            r6.f34164c = r7
            r6.f34165d = r2
            java.lang.Object r2 = r4.getParentDistrictByLeafParents(r3, r6)
            if (r2 != r0) goto Lac
            return r0
        Lac:
            r0 = r7
            r7 = r2
        Lae:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = kotlin.collections.p.m0(r7)
            com.forsale.app.datalayer.database.DistrictEntity r7 = (com.forsale.app.datalayer.database.DistrictEntity) r7
            if (r7 == 0) goto Lbd
            r1.t4(r7, r0, r5)
        Lbd:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$setListingEditDetails$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$setListingEditDetails$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
