package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: AttributeFile.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$4", f = "AttributeFile.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AttributeFile$ViewHolder$setUpUI$1$4 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35340a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFile.ViewHolder f35341b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35342c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeFile.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$4$1", f = "AttributeFile.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeFileViewModel f35344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeFile.ViewHolder f35345c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeFile.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$4$1$1", f = "AttributeFile.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04031 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35346a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeFile.ViewHolder f35347b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeFileViewModel f35348c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04031(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super C04031> aVar) {
                super(2, aVar);
                this.f35347b = viewHolder;
                this.f35348c = attributeFileViewModel;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C04031) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C04031(this.f35347b, this.f35348c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35346a == 0) {
                    f.b(obj);
                    if (this.f35347b.j() instanceof PostAdAttributesFragment) {
                        ((PostAdAttributesFragment) this.f35347b.j()).g0(this.f35348c.i().getId());
                    }
                    this.f35348c.h();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeFileViewModel attributeFileViewModel, AttributeFile.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35344b = attributeFileViewModel;
            this.f35345c = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35344b, this.f35345c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f35343a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<wz.p> s11 = this.f35344b.s();
                C04031 c04031 = new C04031(this.f35345c, this.f35344b, null);
                this.f35343a = 1;
                if (FlowKt.collectLatest(s11, c04031, this) == f11) {
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
    public AttributeFile$ViewHolder$setUpUI$1$4(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFile$ViewHolder$setUpUI$1$4> aVar) {
        super(2, aVar);
        this.f35341b = viewHolder;
        this.f35342c = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFile$ViewHolder$setUpUI$1$4(this.f35341b, this.f35342c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35340a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s j11 = this.f35341b.j();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35342c, this.f35341b, null);
            this.f35340a = 1;
            if (RepeatOnLifecycleKt.b(j11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFile$ViewHolder$setUpUI$1$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
