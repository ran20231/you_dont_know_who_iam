package com.forsale.app.features.postad.bundles;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$loadBundles$1", f = "PostAdBundlesViewModel.kt", l = {154, 157, 160}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$loadBundles$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35036a;

    /* renamed from: b  reason: collision with root package name */
    int f35037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35038c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$loadBundles$1(PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super PostAdBundlesViewModel$loadBundles$1> aVar) {
        super(2, aVar);
        this.f35038c = postAdBundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$loadBundles$1(this.f35038c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f35037b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r7)
            goto L97
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.f35036a
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r1 = (com.forsale.app.features.postad.bundles.PostAdBundlesViewModel) r1
            kotlin.f.b(r7)
            goto L80
        L26:
            kotlin.f.b(r7)
            goto L3e
        L2a:
            kotlin.f.b(r7)
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r7 = r6.f35038c
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.forsale.app.features.postad.bundles.PostAdBundlesViewModel.j(r7)
            com.forsale.app.features.postad.bundles.b$c r1 = com.forsale.app.features.postad.bundles.b.c.f35066a
            r6.f35037b = r4
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L3e
            return r0
        L3e:
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r7 = r6.f35038c
            com.forsale.app.features.postad.PostAdViewModel r7 = r7.A()
            androidx.lifecycle.b0 r7 = r7.p2()
            java.lang.Object r7 = r7.getValue()
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r7 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r7
            if (r7 == 0) goto L97
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r1 = r6.f35038c
            java.lang.Integer r4 = r7.getCategoryId()
            if (r4 == 0) goto L97
            com.forsale.app.features.postad.bundles.BundlesInteractor r4 = com.forsale.app.features.postad.bundles.PostAdBundlesViewModel.f(r1)
            java.lang.Integer r5 = r7.getCategoryId()
            kotlin.jvm.internal.o.f(r5)
            int r5 = r5.intValue()
            java.util.List r7 = r7.getDistrictsIds()
            if (r7 == 0) goto L74
            java.lang.Object r7 = kotlin.collections.p.m0(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L75
        L74:
            r7 = 0
        L75:
            r6.f35036a = r1
            r6.f35037b = r3
            java.lang.Object r7 = r4.a(r5, r7, r6)
            if (r7 != r0) goto L80
            return r0
        L80:
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.postad.bundles.PostAdBundlesViewModel.j(r1)
            com.forsale.app.features.postad.bundles.b$d r4 = new com.forsale.app.features.postad.bundles.b$d
            r4.<init>(r3)
            r6.f35036a = r7
            r6.f35037b = r2
            java.lang.Object r7 = r1.emit(r4, r6)
            if (r7 != r0) goto L97
            return r0
        L97:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$loadBundles$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$loadBundles$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
