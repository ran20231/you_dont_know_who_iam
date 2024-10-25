package com.forsale.app.features.postad.extraattributes.attributeview;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1;
import com.forsale.app.utils.LocaleManager;
import com.google.android.material.chip.ChipGroup;
import g00.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeDropDownHorizontal.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1", f = "AttributeDropDownHorizontal.kt", l = {l8.a.f62266c}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f35226b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownHorizontal.ViewHolder f35227c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeDropDownHorizontal.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1$1", f = "AttributeDropDownHorizontal.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeDropDownHorizontal.ViewHolder f35229b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeDropDownHorizontal.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1$1$1", f = "AttributeDropDownHorizontal.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03951 extends SuspendLambda implements p<List<? extends ExtraAttributeOptionEntity>, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35230a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35231b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeDropDownHorizontal.ViewHolder f35232c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03951(AttributeDropDownHorizontal.ViewHolder viewHolder, zz.a<? super C03951> aVar) {
                super(2, aVar);
                this.f35232c = viewHolder;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(AttributeDropDownHorizontal.ViewHolder viewHolder, View view) {
                int left;
                HorizontalScrollView horizontalScrollView = viewHolder.m().Q;
                if (LocaleManager.f39597a.r()) {
                    left = view.getRight();
                } else {
                    left = view.getLeft();
                }
                horizontalScrollView.smoothScrollTo(left, view.getTop());
            }

            @Override // g00.p
            /* renamed from: c */
            public final Object invoke(List<ExtraAttributeOptionEntity> list, zz.a<? super wz.p> aVar) {
                return ((C03951) create(list, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03951 c03951 = new C03951(this.f35232c, aVar);
                c03951.f35231b = obj;
                return c03951;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ExtraAttributeFlatGroupEntity c11;
                boolean z11;
                boolean z12;
                b.f();
                if (this.f35230a == 0) {
                    f.b(obj);
                    List list = (List) this.f35231b;
                    o.g(list, "null cannot be cast to non-null type java.util.ArrayList<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity>{ kotlin.collections.TypeAliasesKt.ArrayList<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity> }");
                    ArrayList arrayList = (ArrayList) list;
                    arrayList.add(0, new ExtraAttributeOptionEntity(0, 0, 0, " X ", " X "));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ExtraAttributeOptionEntity extraAttributeOptionEntity = (ExtraAttributeOptionEntity) it2.next();
                        this.f35232c.k(extraAttributeOptionEntity.getId(), extraAttributeOptionEntity.getName());
                    }
                    AttributeDropDownHorizontalViewModel h02 = this.f35232c.m().h0();
                    if (h02 != null && (c11 = h02.c()) != null) {
                        final AttributeDropDownHorizontal.ViewHolder viewHolder = this.f35232c;
                        viewHolder.m().O.g(c11.getOptionId());
                        Integer d11 = kotlin.coroutines.jvm.internal.a.d(viewHolder.m().O.getCheckedChipId());
                        if (d11.intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        View view = null;
                        if (!z11) {
                            d11 = null;
                        }
                        if (d11 != null) {
                            int intValue = d11.intValue();
                            ChipGroup chipGroup = viewHolder.m().O;
                            o.h(chipGroup, "chipGroup");
                            Iterator<View> it3 = ViewGroupKt.a(chipGroup).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                View next = it3.next();
                                if (next.getId() == intValue) {
                                    z12 = true;
                                    continue;
                                } else {
                                    z12 = false;
                                    continue;
                                }
                                if (z12) {
                                    view = next;
                                    break;
                                }
                            }
                            final View view2 = view;
                            if (view2 != null) {
                                view2.post(new Runnable() { // from class: com.forsale.app.features.postad.extraattributes.attributeview.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1.AnonymousClass1.C03951.e(AttributeDropDownHorizontal.ViewHolder.this, view2);
                                    }
                                });
                            }
                        }
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeDropDownHorizontal.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35229b = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35229b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<List<ExtraAttributeOptionEntity>> d11;
            f11 = b.f();
            int i11 = this.f35228a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                AttributeDropDownHorizontalViewModel h02 = this.f35229b.m().h0();
                if (h02 != null && (d11 = h02.d()) != null) {
                    C03951 c03951 = new C03951(this.f35229b, null);
                    this.f35228a = 1;
                    if (FlowKt.collectLatest(d11, c03951, this) == f11) {
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
    public AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1(s sVar, AttributeDropDownHorizontal.ViewHolder viewHolder, zz.a<? super AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1> aVar) {
        super(2, aVar);
        this.f35226b = sVar;
        this.f35227c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1(this.f35226b, this.f35227c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35225a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s it2 = this.f35226b;
            o.h(it2, "$it");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35227c, null);
            this.f35225a = 1;
            if (RepeatOnLifecycleKt.b(it2, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
