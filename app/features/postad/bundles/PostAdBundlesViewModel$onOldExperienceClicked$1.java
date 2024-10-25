package com.forsale.app.features.postad.bundles;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$onOldExperienceClicked$1", f = "PostAdBundlesViewModel.kt", l = {99, 100, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$onOldExperienceClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35051a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35052b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$onOldExperienceClicked$1(PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super PostAdBundlesViewModel$onOldExperienceClicked$1> aVar) {
        super(2, aVar);
        this.f35052b = postAdBundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$onOldExperienceClicked$1(this.f35052b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f35051a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r6)
            goto L5a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.f.b(r6)
            goto L49
        L21:
            kotlin.f.b(r6)
            goto L38
        L25:
            kotlin.f.b(r6)
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r6 = r5.f35052b
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.forsale.app.features.postad.bundles.PostAdBundlesViewModel.o(r6)
            r5.f35051a = r4
            r1 = 0
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L38
            return r0
        L38:
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r6 = r5.f35052b
            kotlinx.coroutines.channels.Channel r6 = com.forsale.app.features.postad.bundles.PostAdBundlesViewModel.h(r6)
            com.forsale.app.features.postad.bundles.a$c r1 = com.forsale.app.features.postad.bundles.a.c.f35063a
            r5.f35051a = r3
            java.lang.Object r6 = r6.send(r1, r5)
            if (r6 != r0) goto L49
            return r0
        L49:
            com.forsale.app.features.postad.bundles.PostAdBundlesViewModel r6 = r5.f35052b
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.forsale.app.features.postad.bundles.PostAdBundlesViewModel.l(r6)
            com.forsale.app.features.postad.bundles.d$c r1 = com.forsale.app.features.postad.bundles.d.c.f35075a
            r5.f35051a = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L5a
            return r0
        L5a:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$onOldExperienceClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$onOldExperienceClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
