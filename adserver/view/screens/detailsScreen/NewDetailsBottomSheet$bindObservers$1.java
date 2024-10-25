package com.forsale.adserver.view.screens.detailsScreen;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$1", f = "NewDetailsBottomSheet.kt", l = {395}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet$bindObservers$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21279a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsBottomSheet f21280b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewDetailsBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$1$1", f = "NewDetailsBottomSheet.kt", l = {396}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewDetailsBottomSheet f21282b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewDetailsBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$1$1$1", f = "NewDetailsBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02341 extends SuspendLambda implements g00.p<String, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f21283a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f21284b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ NewDetailsBottomSheet f21285c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02341(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super C02341> aVar) {
                super(2, aVar);
                this.f21285c = newDetailsBottomSheet;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, zz.a<? super wz.p> aVar) {
                return ((C02341) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C02341 c02341 = new C02341(this.f21285c, aVar);
                c02341.f21284b = obj;
                return c02341;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f21283a == 0) {
                    kotlin.f.b(obj);
                    String str = (String) this.f21284b;
                    if (str != null) {
                        final NewDetailsBottomSheet newDetailsBottomSheet = this.f21285c;
                        k.f21363f.a(str, new g00.l<String, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$1$1$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(1);
                            }

                            public final void b(String phone) {
                                NewDetailsViewModel M;
                                kotlin.jvm.internal.o.i(phone, "phone");
                                M = NewDetailsBottomSheet.this.M();
                                M.t0(phone);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ wz.p invoke(String str2) {
                                b(str2);
                                return wz.p.f75480a;
                            }
                        }).show(newDetailsBottomSheet.getChildFragmentManager(), "dial dialog");
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21282b = newDetailsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21282b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            NewDetailsViewModel M;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21281a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                M = this.f21282b.M();
                SharedFlow<String> Q = M.Q();
                C02341 c02341 = new C02341(this.f21282b, null);
                this.f21281a = 1;
                if (FlowKt.collectLatest(Q, c02341, this) == f11) {
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
    public NewDetailsBottomSheet$bindObservers$1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super NewDetailsBottomSheet$bindObservers$1> aVar) {
        super(2, aVar);
        this.f21280b = newDetailsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheet$bindObservers$1(this.f21280b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21279a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NewDetailsBottomSheet newDetailsBottomSheet = this.f21280b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(newDetailsBottomSheet, null);
            this.f21279a = 1;
            if (RepeatOnLifecycleKt.b(newDetailsBottomSheet, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$bindObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
