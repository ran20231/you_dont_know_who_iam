package com.forsale.app.features.postad.bundles;

import android.content.Context;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.postad.bundles.a;
import com.forsale.app.features.postad.bundles.f;
import com.forsale.app.utils.NavigationUtilsKt;
import g00.p;
import g00.q;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: PostAdBundlesFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1", f = "PostAdBundlesFragment.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdBundlesFragment$Actions$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesFragment f34961b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$2", f = "PostAdBundlesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements q<FlowCollector<? super a>, Throwable, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesFragment f34963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super AnonymousClass2> aVar) {
            super(3, aVar);
            this.f34963b = postAdBundlesFragment;
        }

        @Override // g00.q
        /* renamed from: b */
        public final Object invoke(FlowCollector<? super a> flowCollector, Throwable th2, zz.a<? super wz.p> aVar) {
            return new AnonymousClass2(this.f34963b, aVar).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34962a == 0) {
                kotlin.f.b(obj);
                this.f34963b.I().r();
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$3", f = "PostAdBundlesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<a, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34964a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesFragment f34966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super AnonymousClass3> aVar) {
            super(2, aVar);
            this.f34966c = postAdBundlesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(a aVar, zz.a<? super wz.p> aVar2) {
            return ((AnonymousClass3) create(aVar, aVar2)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f34966c, aVar);
            anonymousClass3.f34965b = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34964a == 0) {
                kotlin.f.b(obj);
                a aVar = (a) this.f34965b;
                if (aVar instanceof a.c) {
                    NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this.f34966c), f.d.h(f.f35078a, null, 1, null), null, 2, null);
                } else if ((aVar instanceof a.C0392a) && (context = this.f34966c.getContext()) != null) {
                    a.C0392a c0392a = (a.C0392a) aVar;
                    MainContainerActivity.a.e(MainContainerActivity.O, context, c0392a.a(), c0392a.b(), null, 4, null);
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesFragment$Actions$1(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super PostAdBundlesFragment$Actions$1> aVar) {
        super(2, aVar);
        this.f34961b = postAdBundlesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesFragment$Actions$1(this.f34961b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34960a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            final Flow<a> t11 = this.f34961b.I().t();
            Flow onCompletion = FlowKt.onCompletion(new Flow<a>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ FlowCollector f34948a;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1$2", f = "PostAdBundlesFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: a  reason: collision with root package name */
                        /* synthetic */ Object f34949a;

                        /* renamed from: b  reason: collision with root package name */
                        int f34950b;

                        public AnonymousClass1(zz.a aVar) {
                            super(aVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f34949a = obj;
                            this.f34950b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f34948a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, zz.a r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.f34950b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f34950b = r1
                            goto L18
                        L13:
                            com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.f34949a
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                            int r2 = r0.f34950b
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r7)
                            goto L4b
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            kotlin.f.b(r7)
                            kotlinx.coroutines.flow.FlowCollector r7 = r5.f34948a
                            r2 = r6
                            com.forsale.app.features.postad.bundles.a r2 = (com.forsale.app.features.postad.bundles.a) r2
                            com.forsale.app.features.postad.bundles.a$b r4 = com.forsale.app.features.postad.bundles.a.b.f35062a
                            boolean r2 = kotlin.jvm.internal.o.d(r2, r4)
                            r2 = r2 ^ r3
                            if (r2 == 0) goto L4b
                            r0.f34950b = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L4b
                            return r1
                        L4b:
                            wz.p r6 = wz.p.f75480a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super a> flowCollector, zz.a aVar) {
                    Object f12;
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                    f12 = kotlin.coroutines.intrinsics.b.f();
                    if (collect == f12) {
                        return collect;
                    }
                    return wz.p.f75480a;
                }
            }, new AnonymousClass2(this.f34961b, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f34961b, null);
            this.f34960a = 1;
            if (FlowKt.collectLatest(onCompletion, anonymousClass3, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesFragment$Actions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
