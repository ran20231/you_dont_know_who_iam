package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$3", f = "NewDetailsBottomSheet.kt", l = {414}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet$bindObservers$3 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21295a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsBottomSheet f21296b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewDetailsBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$3$1", f = "NewDetailsBottomSheet.kt", l = {415}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewDetailsBottomSheet f21298b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewDetailsBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$3$1$1", f = "NewDetailsBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02361 extends SuspendLambda implements g00.p<String, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f21299a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f21300b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ NewDetailsBottomSheet f21301c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02361(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super C02361> aVar) {
                super(2, aVar);
                this.f21301c = newDetailsBottomSheet;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, zz.a<? super wz.p> aVar) {
                return ((C02361) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C02361 c02361 = new C02361(this.f21301c, aVar);
                c02361.f21300b = obj;
                return c02361;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Context context;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f21299a == 0) {
                    kotlin.f.b(obj);
                    String str = (String) this.f21300b;
                    if (str != null && (context = this.f21301c.getContext()) != null) {
                        kotlin.jvm.internal.o.f(context);
                        m9.f.j(context, str);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21298b = newDetailsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21298b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            NewDetailsViewModel M;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21297a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                M = this.f21298b.M();
                SharedFlow<String> d02 = M.d0();
                C02361 c02361 = new C02361(this.f21298b, null);
                this.f21297a = 1;
                if (FlowKt.collectLatest(d02, c02361, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsBottomSheet$bindObservers$3(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super NewDetailsBottomSheet$bindObservers$3> aVar) {
        super(2, aVar);
        this.f21296b = newDetailsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheet$bindObservers$3(this.f21296b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21295a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NewDetailsBottomSheet newDetailsBottomSheet = this.f21296b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(newDetailsBottomSheet, null);
            this.f21295a = 1;
            if (RepeatOnLifecycleKt.b(newDetailsBottomSheet, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$bindObservers$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
