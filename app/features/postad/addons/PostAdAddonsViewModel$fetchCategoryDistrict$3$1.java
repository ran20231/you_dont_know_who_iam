package com.forsale.app.features.postad.addons;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$fetchCategoryDistrict$3$1", f = "PostAdAddonsViewModel.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$fetchCategoryDistrict$3$1 extends SuspendLambda implements p<ListingDetailsEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34339a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f34340b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34341c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$fetchCategoryDistrict$3$1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super PostAdAddonsViewModel$fetchCategoryDistrict$3$1> aVar) {
        super(2, aVar);
        this.f34341c = postAdAddonsViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$fetchCategoryDistrict$3$1) create(listingDetailsEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdAddonsViewModel$fetchCategoryDistrict$3$1 postAdAddonsViewModel$fetchCategoryDistrict$3$1 = new PostAdAddonsViewModel$fetchCategoryDistrict$3$1(this.f34341c, aVar);
        postAdAddonsViewModel$fetchCategoryDistrict$3$1.f34340b = obj;
        return postAdAddonsViewModel$fetchCategoryDistrict$3$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f34339a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f34340b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r0 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r0
            kotlin.f.b(r6)
            goto L53
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.f.b(r6)
            java.lang.Object r6 = r5.f34340b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r6 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r6
            java.lang.Integer r1 = r6.getCategoryId()
            if (r1 == 0) goto L58
            com.forsale.app.features.postad.addons.PostAdAddonsViewModel r3 = r5.f34341c
            int r1 = r1.intValue()
            com.forsale.app.datalayer.repositories.CategoriesRepositories r3 = com.forsale.app.features.postad.addons.PostAdAddonsViewModel.z0(r3)
            java.util.List r4 = r6.getDistrictsIds()
            if (r4 == 0) goto L45
            java.lang.Object r4 = kotlin.collections.p.m0(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L45
            int r4 = r4.intValue()
            goto L46
        L45:
            r4 = r2
        L46:
            r5.f34340b = r6
            r5.f34339a = r2
            java.lang.Object r1 = r3.getCategoryDistrictByCategoryId(r1, r4, r5)
            if (r1 != r0) goto L51
            return r0
        L51:
            r0 = r6
            r6 = r1
        L53:
            com.forsale.app.datalayer.database.CategoryDistrict r6 = (com.forsale.app.datalayer.database.CategoryDistrict) r6
            r0.setCategoryDistrict(r6)
        L58:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$fetchCategoryDistrict$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
