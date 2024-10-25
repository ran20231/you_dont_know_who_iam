package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical;
import com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet;
import com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import ue.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeDropDownVertical.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$1", f = "AttributeDropDownVertical.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeDropDownVertical$ViewHolder$setUpUI$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35262a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVertical f35263b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVertical.ViewHolder f35264c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeDropDownVertical.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$1$1", f = "AttributeDropDownVertical.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeDropDownVertical.ViewHolder f35266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeDropDownVertical f35267c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeDropDownVertical.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$1$1$1", f = "AttributeDropDownVertical.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03971 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35268a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeDropDownVertical.ViewHolder f35269b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeDropDownVertical f35270c;

            /* compiled from: AttributeDropDownVertical.kt */
            /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$1$1$1$a */
            /* loaded from: classes2.dex */
            public static final class a implements g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ AttributeDropDownVertical.ViewHolder f35271a;

                a(AttributeDropDownVertical.ViewHolder viewHolder) {
                    this.f35271a = viewHolder;
                }

                @Override // ue.g
                public void a(ExtraAttributeOptionEntity option) {
                    ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity;
                    ObservableField<Integer> j11;
                    ObservableField<String> i11;
                    o.i(option, "option");
                    AttributeDropDownVerticalViewModel h02 = this.f35271a.j().h0();
                    if (h02 != null && (i11 = h02.i()) != null) {
                        i11.k(option.getName());
                    }
                    AttributeDropDownVerticalViewModel h03 = this.f35271a.j().h0();
                    if (h03 != null) {
                        extraAttributeFlatGroupEntity = h03.d();
                    } else {
                        extraAttributeFlatGroupEntity = null;
                    }
                    if (extraAttributeFlatGroupEntity != null) {
                        extraAttributeFlatGroupEntity.setOptionId(option.getId());
                    }
                    AttributeDropDownVerticalViewModel h04 = this.f35271a.j().h0();
                    if (h04 != null && (j11 = h04.j()) != null) {
                        j11.k(Integer.valueOf(option.getId()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03971(AttributeDropDownVertical.ViewHolder viewHolder, AttributeDropDownVertical attributeDropDownVertical, zz.a<? super C03971> aVar) {
                super(2, aVar);
                this.f35269b = viewHolder;
                this.f35270c = attributeDropDownVertical;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C03971) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C03971(this.f35269b, this.f35270c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ExtraAttributeFlatGroupEntity d11;
                ExtraAttributeOptionDao l11;
                ApplicationResourcesRepository m11;
                b.f();
                if (this.f35268a == 0) {
                    f.b(obj);
                    AttributeDropDownVerticalViewModel h02 = this.f35269b.j().h0();
                    if (h02 != null && (d11 = h02.d()) != null) {
                        int id2 = d11.getId();
                        AttributeDropDownVertical.ViewHolder viewHolder = this.f35269b;
                        AttributeDropDownVertical attributeDropDownVertical = this.f35270c;
                        l11 = viewHolder.l();
                        m11 = viewHolder.m();
                        AttributeOptionsViewModel attributeOptionsViewModel = new AttributeOptionsViewModel(id2, l11, m11, t.a(attributeDropDownVertical.w()));
                        a aVar = new a(viewHolder);
                        if (viewHolder.k() instanceof Fragment) {
                            new AttributeOptionsBottomSheet(attributeOptionsViewModel, aVar).show(((Fragment) viewHolder.k()).requireActivity().getSupportFragmentManager(), "");
                        }
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeDropDownVertical.ViewHolder viewHolder, AttributeDropDownVertical attributeDropDownVertical, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35266b = viewHolder;
            this.f35267c = attributeDropDownVertical;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35266b, this.f35267c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<wz.p> g11;
            f11 = b.f();
            int i11 = this.f35265a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                AttributeDropDownVerticalViewModel h02 = this.f35266b.j().h0();
                if (h02 != null && (g11 = h02.g()) != null) {
                    C03971 c03971 = new C03971(this.f35266b, this.f35267c, null);
                    this.f35265a = 1;
                    if (FlowKt.collectLatest(g11, c03971, this) == f11) {
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
    public AttributeDropDownVertical$ViewHolder$setUpUI$1(AttributeDropDownVertical attributeDropDownVertical, AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super AttributeDropDownVertical$ViewHolder$setUpUI$1> aVar) {
        super(2, aVar);
        this.f35263b = attributeDropDownVertical;
        this.f35264c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeDropDownVertical$ViewHolder$setUpUI$1(this.f35263b, this.f35264c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35262a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s w11 = this.f35263b.w();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35264c, this.f35263b, null);
            this.f35262a = 1;
            if (RepeatOnLifecycleKt.b(w11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownVertical$ViewHolder$setUpUI$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
