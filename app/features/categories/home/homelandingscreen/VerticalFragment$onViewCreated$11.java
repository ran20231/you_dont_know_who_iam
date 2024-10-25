package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.analytics.PLFSource;
import g00.l;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$11", f = "VerticalFragment.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$11 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23870a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23871b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<PLFSource> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23872a;

        a(VerticalFragment verticalFragment) {
            this.f23872a = verticalFragment;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(PLFSource pLFSource, zz.a<? super p> aVar) {
            MainContainerActivity mainContainerActivity;
            androidx.appcompat.app.d l11 = ContextExtensionsKt.l(this.f23872a.getActivity());
            if (l11 instanceof MainContainerActivity) {
                mainContainerActivity = (MainContainerActivity) l11;
            } else {
                mainContainerActivity = null;
            }
            if (mainContainerActivity != null) {
                mainContainerActivity.s(pLFSource);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$11(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$11> aVar) {
        super(1, aVar);
        this.f23871b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$11(this.f23871b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23870a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<PLFSource> p12 = this.f23871b.B().p1();
            a aVar = new a(this.f23871b);
            this.f23870a = 1;
            if (p12.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$11) create(aVar)).invokeSuspend(p.f75480a);
    }
}
