package com.forsale.app.features.more;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CmsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.CmsViewModel$loadLinks$1", f = "CmsViewModel.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CmsViewModel$loadLinks$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31592a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f31593b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CmsViewModel f31594c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f31595d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsViewModel$loadLinks$1(String str, CmsViewModel cmsViewModel, String str2, zz.a<? super CmsViewModel$loadLinks$1> aVar) {
        super(2, aVar);
        this.f31593b = str;
        this.f31594c = cmsViewModel;
        this.f31595d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CmsViewModel$loadLinks$1(this.f31593b, this.f31594c, this.f31595d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean z11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31592a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            String str = this.f31593b;
            if (str != null && str.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                mutableStateFlow = this.f31594c.f31569p0;
                WebModel webModel = new WebModel(this.f31595d, null, this.f31593b, false, 10, null);
                this.f31592a = 1;
                if (mutableStateFlow.emit(webModel, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CmsViewModel$loadLinks$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
