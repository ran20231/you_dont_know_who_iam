package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.datalayer.network.entities.BusinessType;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1", f = "PostAdExtraInfoViewModel.kt", l = {141, 143}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35512a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BusinessType f35513b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35514c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1(BusinessType businessType, PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1> aVar) {
        super(2, aVar);
        this.f35513b = businessType;
        this.f35514c = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1(this.f35513b, this.f35514c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        we.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35512a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            BusinessType businessType = this.f35513b;
            if (businessType != null) {
                aVar = this.f35514c.f35486n0;
                this.f35512a = 1;
                if (aVar.b(businessType, this) == f11) {
                    return f11;
                }
            }
        }
        MutableSharedFlow<Boolean> d32 = this.f35514c.o1().d3();
        Boolean a11 = kotlin.coroutines.jvm.internal.a.a(false);
        this.f35512a = 2;
        if (d32.emit(a11, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
