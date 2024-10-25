package com.forsale.adserver.view.composeViews.commercialList;

import androidx.compose.foundation.lazy.LazyListState;
import com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel;
import g00.l;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommercialHorizontalList.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6", f = "CommercialHorizontalList.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommercialHorizontalListKt$CommercialHorizontalList$6 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20914a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f20915b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SharedFlow<wz.p> f20916c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CommercialListViewModel f20917d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<Integer> f20918e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ LazyListState f20919f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f20920g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommercialHorizontalList.kt */
    @d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6$1", f = "CommercialHorizontalList.kt", l = {142, 146}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharedFlow<wz.p> f20922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommercialListViewModel f20923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<Integer> f20924d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LazyListState f20925e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<Boolean, wz.p> f20926f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialHorizontalList.kt */
        @d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6$1$1", f = "CommercialHorizontalList.kt", l = {144}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02321 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f20927a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommercialListViewModel f20928b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<Integer> f20929c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ LazyListState f20930d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02321(CommercialListViewModel commercialListViewModel, List<Integer> list, LazyListState lazyListState, zz.a<? super C02321> aVar) {
                super(2, aVar);
                this.f20928b = commercialListViewModel;
                this.f20929c = list;
                this.f20930d = lazyListState;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C02321) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C02321(this.f20928b, this.f20929c, this.f20930d, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object f11;
                f11 = kotlin.coroutines.intrinsics.b.f();
                int i11 = this.f20927a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        f.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    f.b(obj);
                    this.f20928b.l(this.f20929c);
                    LazyListState lazyListState = this.f20930d;
                    this.f20927a = 1;
                    if (LazyListState.L(lazyListState, 0, 0, this, 2, null) == f11) {
                        return f11;
                    }
                }
                return wz.p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialHorizontalList.kt */
        @d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6$1$2", f = "CommercialHorizontalList.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$6$1$2  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements p<CommercialListViewModel.a, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f20931a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f20932b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l<Boolean, wz.p> f20933c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(l<? super Boolean, wz.p> lVar, zz.a<? super AnonymousClass2> aVar) {
                super(2, aVar);
                this.f20933c = lVar;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(CommercialListViewModel.a aVar, zz.a<? super wz.p> aVar2) {
                return ((AnonymousClass2) create(aVar, aVar2)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f20933c, aVar);
                anonymousClass2.f20932b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z11;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f20931a == 0) {
                    f.b(obj);
                    CommercialListViewModel.a aVar = (CommercialListViewModel.a) this.f20932b;
                    l<Boolean, wz.p> lVar = this.f20933c;
                    if ((aVar instanceof CommercialListViewModel.a.c) && (aVar instanceof CommercialListViewModel.a.d)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.invoke(kotlin.coroutines.jvm.internal.a.a(z11));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SharedFlow<wz.p> sharedFlow, CommercialListViewModel commercialListViewModel, List<Integer> list, LazyListState lazyListState, l<? super Boolean, wz.p> lVar, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f20922b = sharedFlow;
            this.f20923c = commercialListViewModel;
            this.f20924d = list;
            this.f20925e = lazyListState;
            this.f20926f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f20922b, this.f20923c, this.f20924d, this.f20925e, this.f20926f, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f20921a;
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
                SharedFlow<wz.p> sharedFlow = this.f20922b;
                C02321 c02321 = new C02321(this.f20923c, this.f20924d, this.f20925e, null);
                this.f20921a = 1;
                if (FlowKt.collectLatest(sharedFlow, c02321, this) == f11) {
                    return f11;
                }
            }
            MutableSharedFlow<CommercialListViewModel.a> j11 = this.f20923c.j();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f20926f, null);
            this.f20921a = 2;
            if (FlowKt.collectLatest(j11, anonymousClass2, this) == f11) {
                return f11;
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
    /* JADX WARN: Multi-variable type inference failed */
    public CommercialHorizontalListKt$CommercialHorizontalList$6(CoroutineScope coroutineScope, SharedFlow<wz.p> sharedFlow, CommercialListViewModel commercialListViewModel, List<Integer> list, LazyListState lazyListState, l<? super Boolean, wz.p> lVar, zz.a<? super CommercialHorizontalListKt$CommercialHorizontalList$6> aVar) {
        super(2, aVar);
        this.f20915b = coroutineScope;
        this.f20916c = sharedFlow;
        this.f20917d = commercialListViewModel;
        this.f20918e = list;
        this.f20919f = lazyListState;
        this.f20920g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialHorizontalListKt$CommercialHorizontalList$6(this.f20915b, this.f20916c, this.f20917d, this.f20918e, this.f20919f, this.f20920g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f20914a == 0) {
            f.b(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f20915b, null, null, new AnonymousClass1(this.f20916c, this.f20917d, this.f20918e, this.f20919f, this.f20920g, null), 3, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialHorizontalListKt$CommercialHorizontalList$6) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
