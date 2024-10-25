package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$registerWorkRequest$3$1", f = "PostAdViewModel.kt", l = {1140}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$registerWorkRequest$3$1 extends SuspendLambda implements p<PostAdViewModel, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34128a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f34129b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$registerWorkRequest$3$1(boolean z11, PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$registerWorkRequest$3$1> aVar) {
        super(2, aVar);
        this.f34129b = z11;
        this.f34130c = postAdViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(PostAdViewModel postAdViewModel, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$registerWorkRequest$3$1) create(postAdViewModel, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$registerWorkRequest$3$1(this.f34129b, this.f34130c, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0 = r4.f34130c.f33960q2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f34128a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.f.b(r5)
            goto L48
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.f.b(r5)
            boolean r5 = r4.f34129b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "UPLOAD_MEDIA: uploadInForeGround:: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            x10.a.b(r5, r1)
            boolean r5 = r4.f34129b
            if (r5 == 0) goto L48
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f34130c
            kotlinx.coroutines.flow.MutableSharedFlow r5 = com.forsale.app.features.postad.PostAdViewModel.f1(r5)
            wz.p r1 = wz.p.f75480a
            r4.f34128a = r2
            java.lang.Object r5 = r5.emit(r1, r4)
            if (r5 != r0) goto L48
            return r0
        L48:
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f34130c
            androidx.lifecycle.c0 r5 = com.forsale.app.features.postad.PostAdViewModel.H0(r5)
            if (r5 == 0) goto L5b
            com.forsale.app.features.postad.PostAdViewModel r0 = r4.f34130c
            androidx.lifecycle.LiveData r0 = com.forsale.app.features.postad.PostAdViewModel.G0(r0)
            if (r0 == 0) goto L5b
            r0.observeForever(r5)
        L5b:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$registerWorkRequest$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
