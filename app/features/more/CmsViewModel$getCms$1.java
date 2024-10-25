package com.forsale.app.features.more;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CmsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.CmsViewModel$getCms$1", f = "CmsViewModel.kt", l = {122, 122, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CmsViewModel$getCms$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31586a;

    /* renamed from: b  reason: collision with root package name */
    int f31587b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CmsViewModel f31588c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f31589d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f31590e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f31591f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsViewModel$getCms$1(CmsViewModel cmsViewModel, int i11, String str, String str2, zz.a<? super CmsViewModel$getCms$1> aVar) {
        super(2, aVar);
        this.f31588c = cmsViewModel;
        this.f31589d = i11;
        this.f31590e = str;
        this.f31591f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CmsViewModel$getCms$1(this.f31588c, this.f31589d, this.f31590e, this.f31591f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f31587b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r13)
            goto L95
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            kotlin.f.b(r13)
            goto L5b
        L22:
            java.lang.Object r1 = r12.f31586a
            com.forsale.app.datalayer.network.services.CmsService r1 = (com.forsale.app.datalayer.network.services.CmsService) r1
            kotlin.f.b(r13)
            goto L40
        L2a:
            kotlin.f.b(r13)
            com.forsale.app.features.more.CmsViewModel r13 = r12.f31588c
            com.forsale.app.datalayer.network.services.CmsService r1 = com.forsale.app.features.more.CmsViewModel.w0(r13)
            com.forsale.app.features.more.CmsViewModel r13 = r12.f31588c
            r12.f31586a = r1
            r12.f31587b = r4
            java.lang.Object r13 = com.forsale.app.features.more.CmsViewModel.y0(r13, r12)
            if (r13 != r0) goto L40
            return r0
        L40:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r5 = r12.f31589d
            com.forsale.app.datalayer.network.requestsbodies.CmsBody r6 = new com.forsale.app.datalayer.network.requestsbodies.CmsBody
            r6.<init>(r13, r5)
            java.lang.String r13 = r12.f31590e
            r5 = 0
            r12.f31586a = r5
            r12.f31587b = r3
            java.lang.Object r13 = r1.getCms(r6, r13, r12)
            if (r13 != r0) goto L5b
            return r0
        L5b:
            com.forsale.app.features.more.CmsViewModel r1 = r12.f31588c
            r3 = r13
            com.forsale.app.datalayer.network.entities.CmsEntity r3 = (com.forsale.app.datalayer.network.entities.CmsEntity) r3
            androidx.lifecycle.b0 r1 = r1.v0()
            com.forsale.app.base.ViewStates r5 = com.forsale.app.base.ViewStates.CONTENT
            r1.postValue(r5)
            com.forsale.app.features.more.CmsViewModel r1 = r12.f31588c
            java.lang.String r6 = r12.f31591f
            androidx.databinding.ObservableField r5 = r1.O0()
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r4)
            r5.k(r4)
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.more.CmsViewModel.x0(r1)
            com.forsale.app.features.more.WebModel r4 = new com.forsale.app.features.more.WebModel
            java.lang.String r7 = r3.getContent()
            r8 = 0
            r9 = 1
            r10 = 4
            r11 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.f31586a = r13
            r12.f31587b = r2
            java.lang.Object r13 = r1.emit(r4, r12)
            if (r13 != r0) goto L95
            return r0
        L95:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.CmsViewModel$getCms$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CmsViewModel$getCms$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
