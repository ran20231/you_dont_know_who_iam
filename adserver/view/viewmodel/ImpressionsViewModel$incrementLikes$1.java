package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.datalayer.bannerdata.ClickType;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImpressionsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementLikes$1", f = "ImpressionsViewModel.kt", l = {62, 64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ImpressionsViewModel$incrementLikes$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21722a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f21723b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ImpressionsViewModel f21724c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f21725d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ClickType f21726e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f21727f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImpressionsViewModel$incrementLikes$1(boolean z11, ImpressionsViewModel impressionsViewModel, int i11, ClickType clickType, int i12, a<? super ImpressionsViewModel$incrementLikes$1> aVar) {
        super(1, aVar);
        this.f21723b = z11;
        this.f21724c = impressionsViewModel;
        this.f21725d = i11;
        this.f21726e = clickType;
        this.f21727f = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new ImpressionsViewModel$incrementLikes$1(this.f21723b, this.f21724c, this.f21725d, this.f21726e, this.f21727f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:6:0x000e, B:27:0x0066, B:29:0x006e, B:31:0x0075, B:30:0x0073, B:10:0x001a, B:20:0x003f, B:22:0x0047, B:23:0x004c, B:15:0x0024, B:17:0x0028, B:24:0x004f), top: B:36:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:6:0x000e, B:27:0x0066, B:29:0x006e, B:31:0x0075, B:30:0x0073, B:10:0x001a, B:20:0x003f, B:22:0x0047, B:23:0x004c, B:15:0x0024, B:17:0x0028, B:24:0x004f), top: B:36:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:6:0x000e, B:27:0x0066, B:29:0x006e, B:31:0x0075, B:30:0x0073, B:10:0x001a, B:20:0x003f, B:22:0x0047, B:23:0x004c, B:15:0x0024, B:17:0x0028, B:24:0x004f), top: B:36:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:6:0x000e, B:27:0x0066, B:29:0x006e, B:31:0x0075, B:30:0x0073, B:10:0x001a, B:20:0x003f, B:22:0x0047, B:23:0x004c, B:15:0x0024, B:17:0x0028, B:24:0x004f), top: B:36:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f21722a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L1e
            goto L66
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L1e
            goto L3f
        L1e:
            r6 = move-exception
            goto L91
        L21:
            kotlin.f.b(r6)
            boolean r6 = r5.f21723b     // Catch: java.lang.Exception -> L1e
            if (r6 == 0) goto L4f
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel r6 = r5.f21724c     // Catch: java.lang.Exception -> L1e
            com.forsale.adserver.usecases.a r6 = r6.m()     // Catch: java.lang.Exception -> L1e
            int r1 = r5.f21725d     // Catch: java.lang.Exception -> L1e
            com.forsale.adserver.datalayer.bannerdata.ClickType r2 = r5.f21726e     // Catch: java.lang.Exception -> L1e
            kotlinx.coroutines.Deferred r6 = r6.f(r1, r2)     // Catch: java.lang.Exception -> L1e
            r5.f21722a = r3     // Catch: java.lang.Exception -> L1e
            java.lang.Object r6 = r6.await(r5)     // Catch: java.lang.Exception -> L1e
            if (r6 != r0) goto L3f
            return r0
        L3f:
            b9.i r6 = (b9.i) r6     // Catch: java.lang.Exception -> L1e
            java.lang.Integer r6 = r6.a()     // Catch: java.lang.Exception -> L1e
            if (r6 == 0) goto L4c
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L1e
            goto L75
        L4c:
            int r6 = r5.f21727f     // Catch: java.lang.Exception -> L1e
            goto L75
        L4f:
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel r6 = r5.f21724c     // Catch: java.lang.Exception -> L1e
            com.forsale.adserver.usecases.a r6 = r6.m()     // Catch: java.lang.Exception -> L1e
            int r1 = r5.f21725d     // Catch: java.lang.Exception -> L1e
            com.forsale.adserver.datalayer.bannerdata.ClickType r4 = r5.f21726e     // Catch: java.lang.Exception -> L1e
            kotlinx.coroutines.Deferred r6 = r6.d(r1, r4)     // Catch: java.lang.Exception -> L1e
            r5.f21722a = r2     // Catch: java.lang.Exception -> L1e
            java.lang.Object r6 = r6.await(r5)     // Catch: java.lang.Exception -> L1e
            if (r6 != r0) goto L66
            return r0
        L66:
            b9.b r6 = (b9.b) r6     // Catch: java.lang.Exception -> L1e
            java.lang.Integer r6 = r6.a()     // Catch: java.lang.Exception -> L1e
            if (r6 == 0) goto L73
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L1e
            goto L75
        L73:
            int r6 = r5.f21727f     // Catch: java.lang.Exception -> L1e
        L75:
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel r0 = r5.f21724c     // Catch: java.lang.Exception -> L1e
            j9.e r0 = r0.o()     // Catch: java.lang.Exception -> L1e
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Exception -> L1e
            j9.f$d r2 = new j9.f$d     // Catch: java.lang.Exception -> L1e
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r3)     // Catch: java.lang.Exception -> L1e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L1e
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)     // Catch: java.lang.Exception -> L1e
            r1.<init>(r2, r6)     // Catch: java.lang.Exception -> L1e
            r0.postValue(r1)     // Catch: java.lang.Exception -> L1e
            goto Lad
        L91:
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel r0 = r5.f21724c
            j9.e r0 = r0.o()
            kotlin.Pair r1 = new kotlin.Pair
            j9.f$b r2 = new j9.f$b
            r2.<init>(r6)
            int r3 = r5.f21727f
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.a.d(r3)
            r1.<init>(r2, r3)
            r0.postValue(r1)
            r6.getMessage()
        Lad:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementLikes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((ImpressionsViewModel$incrementLikes$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
