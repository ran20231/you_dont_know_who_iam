package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.databinding.ObservableField;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: AttributeDropDownVertical.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$3", f = "AttributeDropDownVertical.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AttributeDropDownVertical$ViewHolder$setUpUI$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35272a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVertical f35273b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVertical.ViewHolder f35274c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeDropDownVertical.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$3$1", f = "AttributeDropDownVertical.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeDropDownVertical.ViewHolder f35276b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeDropDownVertical.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$3$1$1", f = "AttributeDropDownVertical.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03981 extends SuspendLambda implements p<ExtraAttributeOptionEntity, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35277a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35278b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeDropDownVertical.ViewHolder f35279c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03981(AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super C03981> aVar) {
                super(2, aVar);
                this.f35279c = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(ExtraAttributeOptionEntity extraAttributeOptionEntity, zz.a<? super wz.p> aVar) {
                return ((C03981) create(extraAttributeOptionEntity, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03981 c03981 = new C03981(this.f35279c, aVar);
                c03981.f35278b = obj;
                return c03981;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ObservableField<Integer> j11;
                ObservableField<String> i11;
                b.f();
                if (this.f35277a == 0) {
                    f.b(obj);
                    ExtraAttributeOptionEntity extraAttributeOptionEntity = (ExtraAttributeOptionEntity) this.f35278b;
                    if (extraAttributeOptionEntity != null) {
                        AttributeDropDownVerticalViewModel h02 = this.f35279c.j().h0();
                        if (h02 != null && (i11 = h02.i()) != null) {
                            i11.k(extraAttributeOptionEntity.getName());
                        }
                        AttributeDropDownVerticalViewModel h03 = this.f35279c.j().h0();
                        if (h03 != null && (j11 = h03.j()) != null) {
                            j11.k(kotlin.coroutines.jvm.internal.a.d(extraAttributeOptionEntity.getId()));
                        }
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35276b = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35276b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<ExtraAttributeOptionEntity> e11;
            f11 = b.f();
            int i11 = this.f35275a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                AttributeDropDownVerticalViewModel h02 = this.f35276b.j().h0();
                if (h02 != null && (e11 = h02.e()) != null) {
                    C03981 c03981 = new C03981(this.f35276b, null);
                    this.f35275a = 1;
                    if (FlowKt.collectLatest(e11, c03981, this) == f11) {
                        return f11;
                    }
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
    public AttributeDropDownVertical$ViewHolder$setUpUI$3(AttributeDropDownVertical attributeDropDownVertical, AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super AttributeDropDownVertical$ViewHolder$setUpUI$3> aVar) {
        super(2, aVar);
        this.f35273b = attributeDropDownVertical;
        this.f35274c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeDropDownVertical$ViewHolder$setUpUI$3(this.f35273b, this.f35274c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35272a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s w11 = this.f35273b.w();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35274c, null);
            this.f35272a = 1;
            if (RepeatOnLifecycleKt.b(w11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownVertical$ViewHolder$setUpUI$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
