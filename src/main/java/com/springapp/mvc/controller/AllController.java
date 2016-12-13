package com.springapp.mvc.controller;

import com.springapp.mvc.domain.*;
import com.springapp.mvc.repository.AllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AllController {

    @RequestMapping(value = "/")
    public String Terminal() {
        return "index";
    }

    @RequestMapping(value = "PS")
    public String PlayStation() {
        return "PS";
    }

    @RequestMapping(value = "X")
    public String Xbox() {
        return "X";
    }

    @RequestMapping(value = "PC")
    public String PerComp() {
        return "PC";
    }

    private AllRepository listRepository;

    @Autowired
    public AllController(AllRepository listRepository){
        this.listRepository = listRepository;
    }

    @RequestMapping(value = "addonpc", method = RequestMethod.GET)
    public String getListAddonpc(Model model) {
        List<addonpc> addonpcListl = this.listRepository.listAddonpc();
        model.addAttribute("addonpcListl", addonpcListl);

        return "addonpc";
    }

    @RequestMapping(value = "addonps4", method = RequestMethod.GET)
    public String getListAddonps4(Model model) {
        List<addonps4> addonps4Listl = this.listRepository.listAddonps4();
        model.addAttribute("addonps4Listl", addonps4Listl);

        return "addonps4";
    }

    @RequestMapping(value = "addonx", method = RequestMethod.GET)
    public String getListAddonx(Model model) {
        List<addonx> addonxListl = this.listRepository.listAddonx();
        model.addAttribute("addonxListl", addonxListl);

        return "addonx";
    }

    @RequestMapping(value = "avir", method = RequestMethod.GET)
    public String getListAvir(Model model) {
        List<avir> avirListl = this.listRepository.listAvir();
        model.addAttribute("avirListl", avirListl);

        return "avir";
    }

    @RequestMapping(value = "digverpcg", method = RequestMethod.GET)
    public String getListDigverpcg(Model model) {
        List<digverpcg> digverpcgListl = this.listRepository.listDigverpcg();
        model.addAttribute("digverpcgListl", digverpcgListl);

        return "digverpcg";
    }

    @RequestMapping(value = "other", method = RequestMethod.GET)
    public String getListOther(Model model) {
        List<other> otherListl = this.listRepository.listOther();
        model.addAttribute("otherListl", otherListl);

        return "other";
    }

    @RequestMapping(value = "digverps4g", method = RequestMethod.GET)
    public String getListDigverps4g(Model model) {
        List<digverps4g> digverps4gListl = this.listRepository.listDigverps4g();
        model.addAttribute("digverps4gListl", digverps4gListl);

        return "digverps4g";
    }

    @RequestMapping(value = "digverxg", method = RequestMethod.GET)
    public String getListDigverxg(Model model) {
        List<digverxg> digverxgListl = this.listRepository.listDigverxg();
        model.addAttribute("digverxgListl", digverxgListl);

        return "digverxg";
    }

    @RequestMapping(value = "gcpcgame", method = RequestMethod.GET)
    public String getListGcpcgame(Model model) {
        List<gcpcgame> gcpcgameListl = this.listRepository.listGcpcgame();
        model.addAttribute("gcpcgameListl", gcpcgameListl);

        return "gcpcgame";
    }

    @RequestMapping(value = "gcps4game", method = RequestMethod.GET)
    public String getListGcps4game(Model model) {
        List<gcps4game> gcps4gameListl = this.listRepository.listGcps4game();
        model.addAttribute("gcps4gameListl", gcps4gameListl);

        return "gcps4game";
    }

    @RequestMapping(value = "gcxgame", method = RequestMethod.GET)
    public String getListGcxgame(Model model) {
        List<gcxgame> gcxgameListl = this.listRepository.listGcxgame();
        model.addAttribute("gcxgameListl", gcxgameListl);

        return "gcxgame";
    }

    @RequestMapping(value = "itunes", method = RequestMethod.GET)
    public String getListITunes(Model model) {
        List<itunes> itunesListl = this.listRepository.listItunes();
        model.addAttribute("itunesListl", itunesListl);

        return "itunes";
    }

    @RequestMapping(value = "office", method = RequestMethod.GET)
    public String getListOffice(Model model) {
        List<office> officeListl = this.listRepository.listOffice();
        model.addAttribute("officeListl", officeListl);

        return "office";
    }

    @RequestMapping(value = "oncin", method = RequestMethod.GET)
    public String getListOncin(Model model) {
        List<oncin> oncinListl = this.listRepository.listOncin();
        model.addAttribute("oncinListl", oncinListl);

        return "oncin";
    }

    @RequestMapping(value = "refilps", method = RequestMethod.GET)
    public String getListRefilps(Model model) {
        List<refilps> refilpsListl = this.listRepository.listRefilps();
        model.addAttribute("refilpsListl", refilpsListl);

        return "refilps";
    }

    @RequestMapping(value = "refilx", method = RequestMethod.GET)
    public String getListRefilx(Model model) {
        List<refilx> refilxListl = this.listRepository.listRefilx();
        model.addAttribute("refilxListl", refilxListl);

        return "refilx";
    }

    @RequestMapping(value = "sabsps", method = RequestMethod.GET)
    public String getListSabsps(Model model) {
        List<sabsps> sabspsListl = this.listRepository.listSabsps();
        model.addAttribute("sabspsListl", sabspsListl);

        return "sabsps";
    }

    @RequestMapping(value = "sabsx", method = RequestMethod.GET)
    public String getListSabsx(Model model) {
        List<sabsx> sabsxListl = this.listRepository.listSabsx();
        model.addAttribute("sabsxListl", sabsxListl);

        return "sabsx";
    }

    @RequestMapping(value = "turnsol", method = RequestMethod.GET)
    public String getTurnsolSabsx(Model model) {
        List<turnsol> turnsolListl = this.listRepository.listTurnsol();
        model.addAttribute("turnsolListl", turnsolListl);

        return "turnsol";
    }
}
