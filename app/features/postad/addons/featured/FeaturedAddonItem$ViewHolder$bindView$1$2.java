package com.forsale.app.features.postad.addons.featured;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.ui.bottomsheets.mediarequester.MediaRequesterBottomSheet;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonItem.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$2", f = "FeaturedAddonItem.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeaturedAddonItem$ViewHolder$bindView$1$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34697a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonItem f34698b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonItemViewModel f34699c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeaturedAddonItem.kt */
    @d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$2$1", f = "FeaturedAddonItem.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeaturedAddonItemViewModel f34701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FeaturedAddonItem f34702c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FeaturedAddonItem.kt */
        @d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$2$1$1", f = "FeaturedAddonItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03861 extends SuspendLambda implements p<wz.p, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34703a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FeaturedAddonItem f34704b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ FeaturedAddonItemViewModel f34705c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FeaturedAddonItem.kt */
            /* renamed from: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$2$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C03871 extends FunctionReferenceImpl implements g00.a<wz.p> {
                C03871(Object obj) {
                    super(0, obj, FeaturedAddonItemViewModel.class, "openSelector", "openSelector()V", 0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    m();
                    return wz.p.f75480a;
                }

                public final void m() {
                    ((FeaturedAddonItemViewModel) this.receiver).u();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03861(FeaturedAddonItem featuredAddonItem, FeaturedAddonItemViewModel featuredAddonItemViewModel, a<? super C03861> aVar) {
                super(2, aVar);
                this.f34704b = featuredAddonItem;
                this.f34705c = featuredAddonItemViewModel;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, a<? super wz.p> aVar) {
                return ((C03861) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                return new C03861(this.f34704b, this.f34705c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FragmentManager fragmentManager;
                b.f();
                if (this.f34703a == 0) {
                    f.b(obj);
                    MediaRequesterBottomSheet.a aVar = MediaRequesterBottomSheet.A;
                    fragmentManager = this.f34704b.f34684h;
                    aVar.a(fragmentManager, this.f34705c.j(), new C03871(this.f34705c));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeaturedAddonItemViewModel featuredAddonItemViewModel, FeaturedAddonItem featuredAddonItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34701b = featuredAddonItemViewModel;
            this.f34702c = featuredAddonItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f34701b, this.f34702c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f34700a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<wz.p> l11 = this.f34701b.l();
                C03861 c03861 = new C03861(this.f34702c, this.f34701b, null);
                this.f34700a = 1;
                if (FlowKt.collectLatest(l11, c03861, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonItem$ViewHolder$bindView$1$2(FeaturedAddonItem featuredAddonItem, FeaturedAddonItemViewModel featuredAddonItemViewModel, a<? super FeaturedAddonItem$ViewHolder$bindView$1$2> aVar) {
        super(2, aVar);
        this.f34698b = featuredAddonItem;
        this.f34699c = featuredAddonItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FeaturedAddonItem$ViewHolder$bindView$1$2(this.f34698b, this.f34699c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f34697a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f34698b.f34682f;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34699c, this.f34698b, null);
            this.f34697a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FeaturedAddonItem$ViewHolder$bindView$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
