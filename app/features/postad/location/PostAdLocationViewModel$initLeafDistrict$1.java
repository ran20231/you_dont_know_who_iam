package com.forsale.app.features.postad.location;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$initLeafDistrict$1", f = "PostAdLocationViewModel.kt", l = {335, 337}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$initLeafDistrict$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35720a;

    /* renamed from: b  reason: collision with root package name */
    Object f35721b;

    /* renamed from: c  reason: collision with root package name */
    int f35722c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35723d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f35724e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$initLeafDistrict$1(PostAdLocationViewModel postAdLocationViewModel, int i11, zz.a<? super PostAdLocationViewModel$initLeafDistrict$1> aVar) {
        super(2, aVar);
        this.f35723d = postAdLocationViewModel;
        this.f35724e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$initLeafDistrict$1(this.f35723d, this.f35724e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f35722c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r5.f35721b
            com.forsale.app.datalayer.database.DistrictEntity r0 = (com.forsale.app.datalayer.database.DistrictEntity) r0
            java.lang.Object r1 = r5.f35720a
            com.forsale.app.features.postad.location.PostAdLocationViewModel r1 = (com.forsale.app.features.postad.location.PostAdLocationViewModel) r1
            kotlin.f.b(r6)
            goto L4f
        L1b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L23:
            kotlin.f.b(r6)
            goto L3b
        L27:
            kotlin.f.b(r6)
            com.forsale.app.features.postad.location.PostAdLocationViewModel r6 = r5.f35723d
            com.forsale.app.datalayer.repositories.DistrictsRepository r6 = r6.q1()
            int r1 = r5.f35724e
            r5.f35722c = r4
            java.lang.Object r6 = r6.getDistrictByDistrictId(r1, r5)
            if (r6 != r0) goto L3b
            return r0
        L3b:
            com.forsale.app.datalayer.database.DistrictEntity r6 = (com.forsale.app.datalayer.database.DistrictEntity) r6
            if (r6 == 0) goto L57
            com.forsale.app.features.postad.location.PostAdLocationViewModel r1 = r5.f35723d
            r5.f35720a = r1
            r5.f35721b = r6
            r5.f35722c = r3
            java.lang.Object r3 = com.forsale.app.features.postad.location.PostAdLocationViewModel.T0(r1, r6, r2, r5)
            if (r3 != r0) goto L4e
            return r0
        L4e:
            r0 = r6
        L4f:
            wz.p r6 = wz.p.f75480a
            com.forsale.app.features.postad.location.PostAdLocationViewModel.S0(r1, r0)
            wz.p r6 = wz.p.f75480a
            goto L58
        L57:
            r6 = 0
        L58:
            if (r6 != 0) goto L61
            java.lang.String r6 = "currentEntity is Nullable"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            x10.a.b(r6, r0)
        L61:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$initLeafDistrict$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$initLeafDistrict$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
