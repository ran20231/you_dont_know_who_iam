package com.forsale.adserver.view.viewmodel;

import b9.i;
import com.forsale.adserver.datalayer.bannerdata.ClickType;
import g00.l;
import j9.f;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.Deferred;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImpressionsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.ImpressionsViewModel$getLikesCount$1", f = "ImpressionsViewModel.kt", l = {80, 83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ImpressionsViewModel$getLikesCount$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f21716b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ImpressionsViewModel f21717c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f21718d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImpressionsViewModel$getLikesCount$1(boolean z11, ImpressionsViewModel impressionsViewModel, int i11, a<? super ImpressionsViewModel$getLikesCount$1> aVar) {
        super(1, aVar);
        this.f21716b = z11;
        this.f21717c = impressionsViewModel;
        this.f21718d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new ImpressionsViewModel$getLikesCount$1(this.f21716b, this.f21717c, this.f21718d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f21715a;
        try {
        } catch (Exception e11) {
            this.f21717c.k().postValue(new f.b(e11));
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    this.f21717c.k().postValue(new f.d(((b9.b) obj).a()));
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            this.f21717c.k().postValue(new f.d(((i) obj).a()));
            return p.f75480a;
        }
        kotlin.f.b(obj);
        if (this.f21716b) {
            Deferred<i> h11 = this.f21717c.m().h(this.f21718d, ClickType.LIKE);
            this.f21715a = 1;
            obj = h11.await(this);
            if (obj == f11) {
                return f11;
            }
            this.f21717c.k().postValue(new f.d(((i) obj).a()));
            return p.f75480a;
        }
        Deferred<b9.b> g11 = this.f21717c.m().g(this.f21718d, ClickType.LIKE);
        this.f21715a = 2;
        obj = g11.await(this);
        if (obj == f11) {
            return f11;
        }
        this.f21717c.k().postValue(new f.d(((b9.b) obj).a()));
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((ImpressionsViewModel$getLikesCount$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
