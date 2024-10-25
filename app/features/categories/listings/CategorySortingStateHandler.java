package com.forsale.app.features.categories.listings;

import com.forsale.app.features.categories.listings.category.f;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import zz.a;
/* compiled from: CategorySortingStateHandler.kt */
/* loaded from: classes2.dex */
public final class CategorySortingStateHandler {

    /* renamed from: a  reason: collision with root package name */
    private final MutableSharedFlow<f> f27979a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<f> f27980b;

    /* compiled from: CategorySortingStateHandler.kt */
    @d(c = "com.forsale.app.features.categories.listings.CategorySortingStateHandler$1", f = "CategorySortingStateHandler.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.CategorySortingStateHandler$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27986a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CategorySortingStateHandler.kt */
        /* renamed from: com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements FlowCollector<f> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CategorySortingStateHandler f27988a;

            a(CategorySortingStateHandler categorySortingStateHandler) {
                this.f27988a = categorySortingStateHandler;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(f fVar, zz.a<? super wz.p> aVar) {
                this.f27988a.f27980b.setValue(fVar);
                return wz.p.f75480a;
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27986a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                final SharedFlow<f> c11 = CategorySortingStateHandler.this.c();
                Flow<f> flow = new Flow<f>() { // from class: com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    /* renamed from: com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ FlowCollector f27982a;

                        /* compiled from: Emitters.kt */
                        @d(c = "com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1$2", f = "CategorySortingStateHandler.kt", l = {223}, m = "emit")
                        /* renamed from: com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                        /* loaded from: classes2.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* renamed from: a  reason: collision with root package name */
                            /* synthetic */ Object f27983a;

                            /* renamed from: b  reason: collision with root package name */
                            int f27984b;

                            public AnonymousClass1(a aVar) {
                                super(aVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.f27983a = obj;
                                this.f27984b |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f27982a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.f27984b
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f27984b = r1
                                goto L18
                            L13:
                                com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f27983a
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                                int r2 = r0.f27984b
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.f.b(r6)
                                goto L46
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.f.b(r6)
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.f27982a
                                r2 = r5
                                com.forsale.app.features.categories.listings.category.f r2 = (com.forsale.app.features.categories.listings.category.f) r2
                                boolean r2 = r2 instanceof com.forsale.app.features.categories.listings.category.f.b
                                if (r2 == 0) goto L46
                                r0.f27984b = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L46
                                return r1
                            L46:
                                wz.p r5 = wz.p.f75480a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.CategorySortingStateHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super f> flowCollector, a aVar) {
                        Object f12;
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                        f12 = b.f();
                        if (collect == f12) {
                            return collect;
                        }
                        return wz.p.f75480a;
                    }
                };
                a aVar = new a(CategorySortingStateHandler.this);
                this.f27986a = 1;
                if (flow.collect(aVar, this) == f11) {
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

    public CategorySortingStateHandler(CoroutineScope coroutineScope) {
        o.i(coroutineScope, "coroutineScope");
        this.f27979a = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27980b = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    public final StateFlow<f> b() {
        return FlowKt.asStateFlow(this.f27980b);
    }

    public final SharedFlow<f> c() {
        return this.f27979a;
    }

    public final Object d(f fVar, a<? super wz.p> aVar) {
        Object f11;
        Object emit = this.f27979a.emit(fVar, aVar);
        f11 = b.f();
        if (emit == f11) {
            return emit;
        }
        return wz.p.f75480a;
    }
}
