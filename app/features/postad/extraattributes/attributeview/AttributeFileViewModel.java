package com.forsale.app.features.postad.extraattributes.attributeview;

import android.graphics.drawable.Drawable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import java.io.File;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import t9.q0;
import wz.p;
/* compiled from: AttributeFileViewModel.kt */
/* loaded from: classes2.dex */
public final class AttributeFileViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f35376a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtraAttributeFlatGroupEntity f35377b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f35378c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedFlow<p> f35379d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<File> f35380e;

    /* renamed from: f  reason: collision with root package name */
    private final ObservableBoolean f35381f;

    /* renamed from: g  reason: collision with root package name */
    private final ObservableField<String> f35382g;

    /* renamed from: h  reason: collision with root package name */
    private final ObservableBoolean f35383h;

    /* renamed from: i  reason: collision with root package name */
    private final ObservableBoolean f35384i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableSharedFlow<p> f35385j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow<p> f35386k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableSharedFlow<p> f35387l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedFlow<p> f35388m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableSharedFlow<String> f35389n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow<String> f35390o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableSharedFlow<File> f35391p;

    /* renamed from: q  reason: collision with root package name */
    private final SharedFlow<File> f35392q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableSharedFlow<String> f35393r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow<String> f35394s;

    /* JADX WARN: Multi-variable type inference failed */
    public AttributeFileViewModel(CoroutineScope coroutineScope, ExtraAttributeFlatGroupEntity attribute, ApplicationResourcesRepository resourcesRepository, SharedFlow<p> validateFile, StateFlow<? extends File> selectedFileEvent) {
        boolean z11;
        boolean z12;
        o.i(coroutineScope, "coroutineScope");
        o.i(attribute, "attribute");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(validateFile, "validateFile");
        o.i(selectedFileEvent, "selectedFileEvent");
        this.f35376a = coroutineScope;
        this.f35377b = attribute;
        this.f35378c = resourcesRepository;
        this.f35379d = validateFile;
        this.f35380e = selectedFileEvent;
        this.f35381f = new ObservableBoolean(TypeExtensionsKt.h0(attribute.isRequired()));
        this.f35382g = new ObservableField<>(l());
        String l11 = l();
        if (l11 != null && l11.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f35383h = new ObservableBoolean(z11);
        String l12 = l();
        if (l12 != null && l12.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f35384i = new ObservableBoolean(!z12);
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35385j = MutableSharedFlow$default;
        this.f35386k = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35387l = MutableSharedFlow$default2;
        this.f35388m = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<String> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35389n = MutableSharedFlow$default3;
        this.f35390o = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<File> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35391p = MutableSharedFlow$default4;
        this.f35392q = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<String> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35393r = MutableSharedFlow$default5;
        this.f35394s = FlowKt.asSharedFlow(MutableSharedFlow$default5);
    }

    private final String l() {
        if (o()) {
            return this.f35377b.getImage();
        }
        if (this.f35380e.getValue() != null) {
            File value = this.f35380e.getValue();
            if (value != null) {
                return value.getAbsolutePath();
            }
            return null;
        }
        return this.f35377b.getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        boolean z11;
        String absolutePath;
        if (this.f35380e.getValue() != null) {
            File value = this.f35380e.getValue();
            if (value != null && (absolutePath = value.getAbsolutePath()) != null && TypeExtensionsKt.Q(absolutePath)) {
                return true;
            }
        } else {
            String fileName = this.f35377b.getFileName();
            if (fileName != null && TypeExtensionsKt.Q(fileName)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private final boolean o() {
        boolean z11;
        String absolutePath;
        if (this.f35380e.getValue() != null) {
            File value = this.f35380e.getValue();
            if (value != null && (absolutePath = value.getAbsolutePath()) != null && TypeExtensionsKt.S(absolutePath)) {
                return true;
            }
        } else {
            String fileName = this.f35377b.getFileName();
            if (fileName != null && TypeExtensionsKt.S(fileName)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private final boolean x() {
        boolean z11;
        if (!this.f35381f.j()) {
            return false;
        }
        String fileName = this.f35377b.getFileName();
        if (fileName != null && fileName.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final void A() {
        this.f35384i.k(true);
        this.f35383h.k(false);
        this.f35382g.k(l());
    }

    public final void g() {
        x10.a.b("PLF-Attributes::chooseFileClicked ", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.f35376a, null, null, new AttributeFileViewModel$chooseFileClicked$1(this, null), 3, null);
    }

    public final void h() {
        this.f35377b.setFileName("");
        this.f35384i.k(false);
        this.f35383h.k(true);
        this.f35382g.k("");
    }

    public final ExtraAttributeFlatGroupEntity i() {
        return this.f35377b;
    }

    public final Drawable j() {
        if (x()) {
            return this.f35378c.getDrawable(q0.f69797s);
        }
        return this.f35378c.getDrawable(q0.f69793r);
    }

    public final SharedFlow<p> k() {
        return this.f35386k;
    }

    public final ObservableField<String> m() {
        return this.f35382g;
    }

    public final SharedFlow<File> p() {
        return this.f35392q;
    }

    public final SharedFlow<String> q() {
        return this.f35390o;
    }

    public final SharedFlow<String> r() {
        return this.f35394s;
    }

    public final SharedFlow<p> s() {
        return this.f35388m;
    }

    public final StateFlow<File> t() {
        return this.f35380e;
    }

    public final SharedFlow<p> u() {
        return this.f35379d;
    }

    public final ObservableBoolean v() {
        return this.f35383h;
    }

    public final ObservableBoolean w() {
        return this.f35384i;
    }

    public final void y() {
        BuildersKt__Builders_commonKt.launch$default(this.f35376a, null, null, new AttributeFileViewModel$previewFileClicked$1(this, null), 3, null);
    }

    public final void z() {
        BuildersKt__Builders_commonKt.launch$default(this.f35376a, null, null, new AttributeFileViewModel$removeFileClicked$1(this, null), 3, null);
    }
}
