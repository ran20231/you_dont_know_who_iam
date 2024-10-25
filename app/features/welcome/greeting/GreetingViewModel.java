package com.forsale.app.features.welcome.greeting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import wz.p;
/* compiled from: GreetingViewModel.kt */
/* loaded from: classes2.dex */
public final class GreetingViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final a f37126k0;

    /* renamed from: l0  reason: collision with root package name */
    private final LiveData<String> f37127l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f37128m0;

    /* compiled from: GreetingViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.greeting.GreetingViewModel$1", f = "GreetingViewModel.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.welcome.greeting.GreetingViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37129a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f37129a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                this.f37129a = 1;
                if (DelayKt.delay(GreetingViewModel.this.f37126k0.a().getTimeout(), this) == f11) {
                    return f11;
                }
            }
            OneShotEventHandler<p> w02 = GreetingViewModel.this.w0();
            p pVar = p.f75480a;
            w02.i(pVar);
            return pVar;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GreetingViewModel(k0 savedStateHandle, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        a b11 = a.f37131b.b(savedStateHandle);
        this.f37126k0 = b11;
        b0 b0Var = new b0();
        b0Var.setValue(b11.a().getImageUrl());
        this.f37127l0 = b0Var;
        this.f37128m0 = new OneShotEventHandler<>(null, 0, 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    public final OneShotEventHandler<p> w0() {
        return this.f37128m0;
    }

    public final LiveData<String> x0() {
        return this.f37127l0;
    }
}
